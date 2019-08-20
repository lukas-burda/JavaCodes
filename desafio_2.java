package desafios;

public class desafio_2 {
	//x = (1/3 + 2/9 + 3/27 + 4/81... 14 elementos)
	//printar o x
	
	public static void main(String[] args) {
		double i=1;
		double j=3;
		double k=0;
		double resp=0.0;
		
		for(j=1; j<=14; j++) {
			resp =+ i/j;
			i++;
			j*=3;
		System.out.println("esse é o i: "+ i);
		System.out.println("esse é o j: "+ j);
		}
		System.out.println("A soma de 14 elementos da seq. é: " +resp);
		//resp = i/j;
		//System.out.println(resp);
	}

}
