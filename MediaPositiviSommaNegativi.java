package lezione3;

import java.util.Scanner;

public class MediaPositiviSommaNegativi {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Inserisci il valore di N: ");
		int n = scanner.nextInt();
		if(n<=0) {
			System.out.println("Il numero dovrebbe essere positivo, inserisci un'altro");
			n = scanner.nextInt();
		}

		int i=1, sn=0;
		float sp=0, count=0;
		while(i<=n) {
			System.out.println("Inserisci un numero: ");
			int x = scanner.nextInt();
			if(x>0) {
				sp=sp+x;
				count++;
			}else {
				sn=sn+x;
			}
			i++;
		}
		System.out.println("La media dei numeri positivi è: " + sp/((count==0)? 1 : count) + ", la somma dei numeri negativi è: " + sn);
		scanner.close();
	}
}
