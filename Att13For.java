package ListaExercicios03;

import java.util.Scanner;

public class Att13For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int menor = 0;
		int entre = 0;
		int maior= 0;
		int numero;

		System.out.println("Digite 20 números:");
		for (int i = 0; i < 20; i++) {

			System.out.print("Número " + (i + 1) + ": ");
			numero = ler.nextInt();

			if (numero >= 0 && numero <= 100) {
				menor++;
			} 
			else if (numero >= 101 && numero <= 200) {
				entre++;
			} 
			else if (numero > 200) {
				maior++;
			}
		}
		System.out.println("Quantidade de números entre 0 e 100: " + menor);
		System.out.println("Quantidade de números entre 101 e 200: " + entre);
		System.out.println("Quantidade de números maiores que 200: " + maior);
		ler.close();
	}


}


