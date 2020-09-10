package Classes;

public class Fornecedor extends Pessoa {

	double valorCredito;
	double valorDivida;
	double saldo;
	
	public double obterSaldo() {
		return saldo = valorCredito - valorDivida;
	}
}
