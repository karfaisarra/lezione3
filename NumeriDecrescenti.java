package lezione3;

import java.util.Scanner;

public class NumeriDecrescenti {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int n1, n2, max, min;
		
		System.out.println("Inserisci il primo numero");
		n1 = scanner.nextInt();
		
		System.out.println("Inserisci il secondo numero");
		n2 = scanner.nextInt();
		
		if(n1>n2) {
			max = n1;
			min = n2;
		} else {
			max = n2;
			min = n1;
		}
		
		while(max>=min) {
			System.out.println(max);
			max--;
		}
		scanner.close();
	}
}
