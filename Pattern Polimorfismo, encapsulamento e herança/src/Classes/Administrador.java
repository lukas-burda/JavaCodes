package Classes;

public class Administrador extends Empregado {

	public double ajudaDeCusto;
	
	@Override
	public double calcularSalario() {
		return (salarioBase + ajudaDeCusto) - (imposto * salarioBase);
	}
}
