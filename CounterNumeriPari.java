package lezione3;

import java.util.Scanner;

public class CounterNumeriPari {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int i=0, count=0;
		while(i<15) {
			System.out.println("Inserici un numero");
			int x = scanner.nextInt();
			
			if(x%2==0) {
				count++;
			}
			i++;
		}
		System.out.println("Hai inserito " + count + " numeri pari");
		scanner.close();
	}
}
