package Classes;

public class EmpregdoTeste {

	public static void main(String[] args) {
		Empregado emp = new Empregado();
		emp.nome = "Pedreirin";
		emp.salarioBase = 1550;
		emp.imposto = 0.15;
		System.out.println("O salário de "+ emp.nome + " após os descontos é de: " + emp.calcularSalario());
		

	}

}
