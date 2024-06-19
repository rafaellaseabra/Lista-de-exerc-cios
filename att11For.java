package ListaExercicios03;

import java.util.Scanner;

public class att11For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int pares = 0;
		int numero;
		
		System.out.println("Digite 20 números:");
		for (int i = 0; i < 20; i++) {
			
		System.out.print("Número " + (i + 1) + ": ");
		 numero = ler.nextInt();
		
		if (numero % 2 == 0) {
		pares++;
		
	}
		}
		System.out.println("Quantidade de números pares: " + pares);
		ler.close();

	}

}
