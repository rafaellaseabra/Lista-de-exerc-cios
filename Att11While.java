package ListaExercicios03;

import java.util.Scanner;

public class Att11While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int pares = 0;
		int i = 0, numero;
		
		System.out.println("Digite 20 números:");
		while (i < 20) {
			
		System.out.print("Número " + (i + 1) + ": ");
		numero = ler.nextInt();
		if (numero % 2 == 0) {
		pares++;
		}
		
		i++;
		}
		System.out.println("Quantidade de números pares: " + pares);
		ler.close();

	}

}
