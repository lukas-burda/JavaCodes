package Sistema;

abstract class AbsProduto {
	public String Nome = "";
	public double Valor = 0.0;
	public String EndRetirada = "";
	public String Entrega = "";
	
	public double Valor() {
		return this.Valor;
	}
}
