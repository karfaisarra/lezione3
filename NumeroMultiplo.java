package lezione3;

import java.util.Scanner;

public class NumeroMultiplo {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Quanti numeri voi inserire? ");
		int n=scanner.nextInt();
		
		while(n<=0) {
			System.out.println("Devi inserire un numero positivo, riprova ");
			n=scanner.nextInt();
		}
		System.out.println("Inserisci il numero di riferimento: ");
		int x=scanner.nextInt();
		
		int count=0;
		for(int i=0; i<n;i++) {
			System.out.println("Inserisci un numero: ");
			int y=scanner.nextInt();
			if(y/x==0) {
				count++;
			}
		}
		System.out.println("Hai inserito " + count + " numeri miltipli di " + x);
		scanner.close();
	}
}
