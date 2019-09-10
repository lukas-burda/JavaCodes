package desafios;

import java.util.Scanner;

public class desafio_1 {

	public static void main(String[] args) {
		//Crie um programa em JAVA que peça um número ao usuário e armazene ele na variável x. Depois peça outro número e armazene na variável y.
		//Mostre esses números. Em seguida, faça com que x passe a ter o valor de y, e que y passe a ter o valor de x.
		//Dica: você vai precisar usar outra variável. Você NÃO precisa trabalhar com o comando SE.
		int x = 0;
		int y = 0;
		int z = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira um valor para X: ");
		x = teclado.nextInt();
		
		teclado = null;
	   	teclado = new Scanner(System.in);
	    
		System.out.println("Insira um valor para Y: ");
		y = teclado.nextInt();
	
		z = y;
		y = x;
		x = z;
		System.out.println("Os valores foram invertidos! Agora X vale " + x +" e Y vale: "+y);
	}
}
