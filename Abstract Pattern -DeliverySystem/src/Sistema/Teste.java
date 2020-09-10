package Sistema;

public class Teste {

	public static void main(String[] args) {	
		MaquinaProd maquina = new MaquinaProd();
		
		AbsProduto produto = maquina.Maquina("hotdog");
		
		maquina.Itens.add(produto);
		
		//Cartao pagamento = new Cartao();
		Dinheiro pagamento = new Dinheiro();
		
		maquina.Finalizar(pagamento);
	}
}
