package Classes;

public class Pessoa {

	public String nome;
	public String endereco;
	public String cpf;
	public int idade;


	Pessoa(){

	}

	public Pessoa(String cpf){
		if (cpf == "888") {
			this.nome = "Pedreirin";
			this.endereco = "Rua do cpf";
			this.idade = 64;
		}
	}
	public Pessoa(int idade) {
		if(idade == 64) {
			this.nome = "José";
			this.endereco = "Caminho da idade";
			this.cpf = "888";
		}
	}
}
