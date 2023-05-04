package lezione3;

import java.util.Scanner;

public class SommaNumeriPositivi {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		int n = scanner.nextInt();
		
		while(n<=0) {
			System.out.println("Il numero dovrebbe essere positivo, inserisci un'altro");
			n = scanner.nextInt();
		}
		
		int i=1, somma=0;
		while(i<=n) {
			somma += i;
			i++;
		}
		System.out.println("La somme dei primi "+ n + " numeri è: " + somma);
		scanner.close();
	}
}
