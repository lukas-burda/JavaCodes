package Classes;

public class AdministradorTeste {
	
	public static void main(String[] args) {
		
		Administrador adm = new Administrador();
		adm.ajudaDeCusto = 900.50;
		adm.salarioBase = 1550;
		adm.imposto = 0.15;
		System.out.println("O salário do Administrador é de: "+ adm.calcularSalario());
		
	}
}
