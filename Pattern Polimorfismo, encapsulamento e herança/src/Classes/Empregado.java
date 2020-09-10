package Classes;

public class Empregado extends Pessoa {
	
	private int codigoSetor;
	public double salarioBase;
	public double imposto;
	
	public double calcularSalario() {
		return salarioBase - (imposto * salarioBase);
	}
}
