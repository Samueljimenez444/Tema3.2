package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos una variable entera que almacenara la lngitud de la frase1
		int longitud1;
		// Cremos una variable entera que almacenara la longitud de la frase2
		int longitud2;
		// Creamos una variable cadena frase1 que almacenara una frase introducida por
		// el usuario
		String frase1;
		// Creamos una variable cadena frase2 que almacenara otra frase introducida por
		// el usuario
		String frase2;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Print
		System.out.println("Introduce tu primera frase");
		// Frase1 sera igual a el input del usuario
		frase1 = lectura.nextLine();
		// Print
		System.out.println("Introduce la segunda frase");
		// frase2 sera igual a el proximo input del usuario
		frase2 = lectura.nextLine();
		// Longitud es igual a la longitud de frase1
		longitud1 = frase1.length();
		// Longitud es igual a la longitud de frase2
		longitud2 = frase2.length();
		/*
		 * Si la longitud1>longitud2 se mostrara como la frase1 es mas larga que la
		 * segunda
		 */
		if (longitud1 > longitud2) {
			System.out.println("La primera frase es mayor a la segunda");
		}
		/*
		 * Si la longitud2 es mayor a la longitud1 se mostrara como la frase2 es mas
		 * larga que la frase2
		 */
		else if (longitud2 > longitud1) {
			System.out.println("La segunda frase es mayor a la primera");
		}
		/* En cualquier otro caso las frases son iguales */
		else {
			System.out.println("Las frases son iguales");
		}
		// Cierre Scanner
		lectura.close();

	}

}
