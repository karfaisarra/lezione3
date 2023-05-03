package lezione3;

import java.util.Scanner;

public class MediaNumeriMinoriDiSoglia {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Inserisci il valore di N: ");
		int n=scanner.nextInt();
		
		while(n<=0) {
			System.out.println("Riprova: ");
			n=scanner.nextInt();
		}
		
		System.out.println("Inserisci il valore di S: ");
		int s=scanner.nextInt();
		
		float somma=0, m, x;
		int i=0, count=0;
		do {
			System.out.println("Inserisci un numero: ");
			x=scanner.nextFloat();
			if(x<=s) {
				somma=somma+x;
				count++;
			}
			i++;
		}while(i<n);
		
		m=somma/count;
		System.out.println("La media è: " + m);
		scanner.close();
	}
}
