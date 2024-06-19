package ListaExercicios03;

import java.util.Scanner;

public class Att10while {

	public static void main(String[] args) {
		
     Scanner ler = new Scanner(System.in);
     int contadorMaioresQue8 = 0;
	 int contador = 0;
     int numero;
		 while (contador < 20) {
		 System.out.print("Digite o número " + (contador + 1) + ": ");
		  numero = ler.nextInt();
		 
		 if (numero > 8) {
		  contadorMaioresQue8++;
		}
		   contador++;
   }

		        
		System.out.println("Quantidade de números maiores que 8: " + contadorMaioresQue8);
		        
		ler.close();
		
    }
		}

