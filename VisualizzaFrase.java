package lezione3;

import java.util.Scanner;

public class VisualizzaFrase {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci una frase");
		String frase = scanner.nextLine();
		
		int i=1;
		while(i<=5) {
			System.out.println(frase);
			i++;
		}
		scanner.close();
	}
}
