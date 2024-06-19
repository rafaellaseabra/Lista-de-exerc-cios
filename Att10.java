package ListaExercicios03;

import java.util.Scanner;

public class Att10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero = 0, contador = 0;
		int contadorMaioresQue8 = 0;

		for (int i = 0; i < 20; i++) {
			System.out.print("Digite o número " + (i + 1) + ": ");
			numero = ler.nextInt();

			if (numero > 8) {
				contadorMaioresQue8++;
			}
			contador++;
		}


		System.out.println("Quantidade de números maiores que 8: " + contadorMaioresQue8);



	}

}





