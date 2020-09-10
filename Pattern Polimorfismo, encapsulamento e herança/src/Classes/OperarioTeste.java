package Classes;

public class OperarioTeste {

	public static void main(String[] args) {
		Operario op = new Operario();
		op.salarioBase = 1550;
		op.imposto = 0.15;
		op.comissao = 0.20;
		op.valorProducao = 10000;

		System.out.println("O salário do Operário é: " + op.calcularSalario());
	}

}
