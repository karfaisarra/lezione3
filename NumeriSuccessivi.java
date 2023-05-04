package lezione3;

import java.util.Scanner;

public class NumeriSuccessivi {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci il valore di N: ");
		int n = scanner.nextInt();
		if(n<=0) {
			System.out.println("Il numero dovrebbe essere positivo, inserisci un'altro: ");
			n = scanner.nextInt();
		}
		
		System.out.println("Inserisci il valore di X: ");
		int x = scanner.nextInt();
		int i = x+1;
		while(i<=x+n) {
			System.out.println(i);
			i++;
		}
		scanner.close();
	}
}
