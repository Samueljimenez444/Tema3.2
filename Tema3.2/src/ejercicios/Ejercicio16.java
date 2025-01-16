package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
	public static char[] codificador(String frase) {
		int auxiliar;
		int random;
		int random2;
		boolean igual = true;
		Random rand = new Random();
		random = rand.nextInt(1, frase.length());
		random2 = rand.nextInt(1, frase.length());
		char[] original = new char[frase.length()];
		char[] codificar = new char[frase.length()];
		codificar = frase.toCharArray();
		original = frase.toCharArray();
		for (int i = 0; i < codificar.length; i++) {
			auxiliar = codificar[random];
			codificar[random] = codificar[random2];
			codificar[random2] = (char) auxiliar;
			random = rand.nextInt(1, frase.length());
			random2 = rand.nextInt(1, frase.length());
		}
		return codificar;
	}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String frase1;
			String frase2 = " ";
			int contador=0;
			Scanner lectura = new Scanner(System.in);
			System.out.println("Introduce una frase");
			frase1 = lectura.nextLine();
			while (frase1.length() <= 2) {
				System.out.println("La frase esta vacia o no contiene una palabra valida introduce otra frase");
				frase1 = lectura.nextLine();
			}
			System.out.println(codificador(frase1));
			System.out.println("Adivine la frase del jugador 1");
			frase2 = lectura.nextLine();
			while (!frase2.equals(frase1)) {
				for(int i=0;i<frase2.length();i++){
					if(frase2.charAt(i)==frase1.charAt(i)){
						contador++;
					}
				
				}
				System.out.println("Prueba otra vez jugador 2 has acertado " +contador+" letras");
				frase2 = lectura.nextLine();
				contador=0;
			}
			System.out.println("Has ganado jugador 2");
			lectura.close();
		}
	}
