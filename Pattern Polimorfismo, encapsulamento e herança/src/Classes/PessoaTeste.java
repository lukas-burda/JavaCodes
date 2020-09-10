package Classes;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa	pe = new Pessoa("888");
		System.out.println(pe.nome +  " " + pe.endereco +  " " + pe.idade);
		
		pe = new Pessoa(64);
		System.out.println(pe.nome +  " " + pe.endereco +  " " + pe.cpf);
	}


}
