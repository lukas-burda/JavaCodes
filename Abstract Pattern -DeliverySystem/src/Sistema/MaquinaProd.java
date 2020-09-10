package Sistema;

import java.util.ArrayList;

public class MaquinaProd {
	String Cliente = "";
	ArrayList<AbsProduto> Itens = new ArrayList<AbsProduto>();
	
	public void Finalizar(AbsPagamento pagamento) {
		System.out.println("Pedido efetuado.");
		
		double total = 0;
		int tipo = 0;
		
		for(AbsProduto obj : this.Itens) {
			total += obj.Valor();
			
			if (obj.Entrega == "Bicicleta") {
				if (tipo < 1) {
					tipo = 1;
				}
			}
			else if (obj.Entrega == "Moto") {
				if (tipo < 2) {
					tipo = 2;
				}
			}
		}
		
		switch (tipo) {
		case 1:
			total += 4;
			break;
		case 2:
			total += 6;
			break;
		default:
			total += 0;
		}
		
		boolean verificar = pagamento.Pagar(pagamento, total);
		
		if (verificar) {
			System.out.println("Valor dos produtos e a taxa de entrega: R$ " + total);
			
			Parceiro parceiro = new Parceiro();
			parceiro.Pedido(Itens);
			
			Cliente cliente = new Cliente();
			
			Entregador entregador = new Entregador();
			entregador.Entregar(Itens, cliente.Endereco);
		}
		else {
			System.out.println("Pedido cancelado, saldo indisponível.");
		}
	}
	
	public AbsProduto Maquina(String tipo) {
		AbsProduto produto = null;
		switch (tipo) {
		case "hotdog":
			CachorroQuente hotdog = new CachorroQuente();
			produto = hotdog;
			break;

		default:
			throw new IllegalArgumentException("Produto " + tipo + " não encontrado.");
		}
		
		return produto;
	}
}
