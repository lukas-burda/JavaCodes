package Sistema;

import java.util.ArrayList;

public class Entregador extends AbsUsuario {
	Entregador(){
		this.CPF = "564";
		this.DataNascimento = "12/05/2000";
		this.Endereco = "Rui Barbosa";
		this.Nome = "Juscelino Kubitschek";
	}
	
	public void Entregar(ArrayList<AbsProduto> produto, String EndEntrega) {
		System.out.println("Produtos coletados. A caminho do endereço: " + EndEntrega + ".");
		System.out.println("Produtos entregue.");
	}
}
