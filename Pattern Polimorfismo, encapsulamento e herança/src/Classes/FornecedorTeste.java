package Classes;

public class FornecedorTeste {

	public static void main(String[] args) {
		
		Fornecedor fornec = new Fornecedor();
		fornec.nome = "Jos�";
		fornec.valorCredito = 1050;
		fornec.valorDivida = 1000.50;
		System.out.println("o saldo com o fornecedor " + fornec.nome + " �: " + fornec.obterSaldo());
	
	}

}
