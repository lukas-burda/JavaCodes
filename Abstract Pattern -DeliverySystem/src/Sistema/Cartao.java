package Sistema;

public class Cartao extends AbsPagamento {
	public String Agencia = "";
	public String Conta = "";
	public String Senha = "";
	private double Saldo = 900;
	
	Cartao(){
		this.Agencia = "0001";
		this.Conta = "15759-2";
		this.Senha = "123456";
	}
	
	public boolean Pagar(AbsPagamento pagamento, double total){
		if (this.Saldo >= total) {
			return true;
		}
		return false;
	}
}
