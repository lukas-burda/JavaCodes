package desafios;

import java.util.Scanner;

public class desafio_1 {

	public static void main(String[] args) {
		//Crie um programa em JAVA que pe�a um n�mero ao usu�rio e armazene ele na vari�vel�x. Depois pe�a outro n�mero e armazene na vari�vel�y.
		//Mostre esses n�meros. Em seguida, fa�a com que�x�passe a ter o valor de�y, e que�y�passe a ter o valor de�x.
		//Dica: voc� vai precisar usar outra vari�vel. Voc� N�O precisa trabalhar com o comando SE.
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
