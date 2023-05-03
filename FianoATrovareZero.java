package lezione3;

import java.util.Scanner;

public class FianoATrovareZero {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Inserisci un numero");
		float x=scanner.nextFloat();
		float s = x;
		int i=1;
		float media;
		while(x!=0) {
			System.out.println("Inserisci un numero");
			x=scanner.nextInt();
			s=s+x;
			i++;
		}
		
		if(i>0) {
			media = s/(i-1);
		}else {
			media=0;
		}
		System.out.println("Programma finito! media = " + media);
		scanner.close();
	}
}
