package Classes;

public class Operario extends Empregado {

	public double valorProducao;
	public double comissao;
	
	@Override
	public double calcularSalario() {
		return salarioBase - (salarioBase * imposto) + (comissao * valorProducao);
	}
	
}
