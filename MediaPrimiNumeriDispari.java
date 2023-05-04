package lezione3;

import java.util.Scanner;

public class MediaPrimiNumeriDispari {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		int n = scanner.nextInt();
		while(n<=0) {
			System.out.println("il numero dovrebbe essere positivo, inserisi un'altro");
			n = scanner.nextInt();
		}
		int i=0;
		float s=0, m;
		while(i<n*2) {
			if(i%2==1) {
				//System.out.println(i);
				s = s + i;
			}
			i++;
		}
		m=s/n;
		System.out.println("La media dei primi " + n + " numeri dispari è: " + m );
		scanner.close();
	}
}
