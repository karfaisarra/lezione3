package lezione3;

import java.util.Scanner;

public class MediaNumeri {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int x, i = 0;
		float somma = 0f, m;
		
		while(i<10) {
			System.out.println("Inserisci un numero: ");
			x = scanner.nextInt();
			somma = somma + x;
			i++;
		}
		m = somma / i;
		System.out.println("la media è: " + m);
		scanner.close();
	}
}
