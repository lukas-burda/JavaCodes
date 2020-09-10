package Sistema;

import java.util.ArrayList;

public class Parceiro extends AbsUsuario {
	Parceiro(){
		this.CPF = "123";
		this.DataNascimento = "01/01/0001";
		this.Endereco = "Avenida Paulista";
		this.Nome = "Ian Vlodian";
	}
	
	public void Registrar(AbsProduto produto) {
		System.out.println("Produto " + produto.Nome + " registrado.");
	}
	
	public void Pedido(ArrayList<AbsProduto> produtos) {
		System.out.println("Aguardando Entregador.");
	}
}
