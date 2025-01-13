package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {
	static boolean anagramas(String palabra, String palabra2, char[] palabra1, char[] palabras2) {
		boolean anagrama = false;
		Arrays.sort(palabra1);
		Arrays.sort(palabras2);

		if (Arrays.equals(palabra1, palabras2)) {
			anagrama = true;
			
		}
		return anagrama;
	}

	public static void main(String[] args) {
		// Creamos una array de caracteres en el que guardaremos los caracteres de la
		// palabra
		char[] palabras;
		// Creamos otro array en el que guardaremos los caracteres de la segunda palabra
		char[] palabras2;
		// Creamos una variable donde almacenaremos la palabra
		String palabra;
		// Creamos una variable donde almacenaremos la segunda palabra
		String palabra2;
		// Creamos el objeto scanner
		Scanner lectura = new Scanner(System.in);
		// Print
		System.out.println("Introduce una palabra");
		// Leemos la palabra que introduzca el usuario por el scanner
		palabra = lectura.next();
		System.out.println("Introduce otra palabra");
		// Leemos la palabra que introduzca el usuario por consola
		palabra2 = lectura.next();
		// Definimos la longitud del array en funcion de la longitud de la palabra
		palabras = new char[palabra.length()];
		// Definimos la longitud del array en funcion de la longitud de la palabra
		palabras2 = new char[palabra2.length()];
		/*
		 * Creamos dos bucle for que rellenara los arrays con los caracteres de la
		 * palabra
		 */
		for (int i = 0; i < palabra.length(); i++) {
			palabras[i] = palabra.charAt(i);
		}
		for (int i = 0; i < palabra2.length(); i++) {
			palabras2[i] = palabra2.charAt(i);
		}
		// Print que nos indicara si las palabras son anagramas o no
		System.out.println(anagramas(palabra, palabra2, palabras, palabras2));
		lectura.close();
	}

}
