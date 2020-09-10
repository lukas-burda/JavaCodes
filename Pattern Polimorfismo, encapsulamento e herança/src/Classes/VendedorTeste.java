package Classes;

public class VendedorTeste {

	public static void main(String[] args) {
		Vendedor vend = new Vendedor();
		vend.comissao = 0.10;
		vend.valorVendas = 25000;
		vend.salarioBase = 1550;
		vend.imposto = 0.15;
		
		System.out.println("O salário do Vendeor é: " + vend.calcularSalario());

	}

}
