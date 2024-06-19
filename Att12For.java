package ListaExercicios03;

import java.util.Scanner;

public class Att12For {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int contadorIntervalo = 0, numero;
		
		for (int contadorNumeros = 0; contadorNumeros < 20; contadorNumeros++) {
		System.out.print("Digite um número: ");
		numero = ler.nextInt();
		 
		if (numero >= 0 && numero <= 100) {
		contadorIntervalo++;
	}
		}
		System.out.println("Quantidade de números entre 0 e 100: " + contadorIntervalo);
		ler.close();
		}
	}

	


