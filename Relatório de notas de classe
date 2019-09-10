package desafios;

import java.util.Scanner;

public class desafio_aula_6 {

	public static void main(String[] args) {
		
		/* Um professor deseja lançar as notas da sua turma de Desenvolvimento de Software.
		Para tanto, você deve utilizar um vetor para os nomes e outro para as notas.
		O professor deve informar quantos alunos há na turma.
		O seu programa deve receber o nome e a respectiva nota de cada aluno
		Ao final, imprima um relatório de notas (nome e nota)
		A média da turma
		A maior nota, seguida do nome do aluno com essa nota
		A menor nota, seguida do nome do aluno com essa nota */


		Scanner teco = new Scanner(System.in);
		int qntsala = 0;
		System.out.print("Insira a quantidade de alunos da sala: ");
		qntsala = teco.nextInt();
		
		double notas[] = new double[qntsala], media =0, maior = 0, menor =999;
		String nomes[] = new String[qntsala];
		System.out.println("Sua sala tem "+nomes.length+" alunos.\n");

		
			for(int i=0; i<notas.length; i++) {
				System.out.print("Insira o "+(i+1)+"º nome: ");
				Scanner fortec = new Scanner(System.in);
				nomes[i] = fortec.nextLine();
				
				System.out.print("Insira a "+(i+1)+"º nota: ");
				Scanner forteco = new Scanner(System.in);
				notas[i] = forteco.nextFloat();
				media+=notas[i];
				
				if(maior<notas[i]) {
					maior = notas[i];
				}
				if(menor>notas[i]) {
					menor = notas[i];
				}
				}
			System.out.println("ALUNO,\tNOTA");
			for(int i=0; i<nomes.length; i++) {
				System.out.println(nomes[i]+",\t"+notas[i]);
			}
				double total=media/notas.length;
				System.out.println("\nA média da sala é: " +total+"\nA maior nota foi "+maior+"\nA menor nota foi "+menor);

	}

}
