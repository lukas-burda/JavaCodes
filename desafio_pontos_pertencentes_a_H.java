package desafios;

import java.util.Scanner;

public class desafio_pontos_pertencentes_a_H {

	public static void main(String[] args) {
		//Os pontos (x,y) que pertencem � figura H (abaixo) s�o tais que     x > 0   e   x2 + y2 < 1. 
		//Dados n pontos reais (x,y), verifique se cada ponto pertence ou n�o a H.

				
				Scanner teclado = new Scanner(System.in);
				float x;
				float y;
				
				System.out.println("Insira um n�mero: ");
				x = teclado.nextFloat();
				
				teclado = null;
				teclado = new Scanner(System.in);
				
				System.out.println("Insira um n�mero: ");
				y = teclado.nextFloat();
				
				float res = ((x*x)+(y*y));
				//Math.pow(x,numero) para elevar
				if( x >= 0 && res <= 1 ) {
				System.out.println("Eles pertencem a H!");
				}
				
				else {
					System.out.println("N�o pertencem a H!");
				}

	}

}
