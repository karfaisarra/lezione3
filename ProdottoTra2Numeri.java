package lezione3;

import java.util.Scanner;

public class ProdottoTra2Numeri {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero");
		int n1= scanner.nextInt();
		
		System.out.println("Inserisci il secondo numero");
		int n2= scanner.nextInt();
		
		int p=0, i =1;
		
		while(i<=n2) {
			p = p+n1;
			i++;
		}
		System.out.println("Il prodotto di " + n1 + " e " + n2 + " uguale a " + p);
		scanner.close();
	}
}
