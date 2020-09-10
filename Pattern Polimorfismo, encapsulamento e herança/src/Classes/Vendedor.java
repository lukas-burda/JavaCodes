package Classes;

public class Vendedor extends Empregado{
	public double valorVendas;
	public double comissao;
	
	@Override
	public double calcularSalario() {
		return salarioBase - (salarioBase * imposto) + (comissao * valorVendas);
	}
}
