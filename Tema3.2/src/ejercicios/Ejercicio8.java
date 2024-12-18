package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Crear un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario que ingrese una frase
		System.out.println("Introduce una frase:");
		String frase = scanner.nextLine();

		// Separar la frase en palabras usando el espacio como delimitador
		String[] palabras = frase.split(" ");

		// Ordenar las palabras alfabéticamente
		Arrays.sort(palabras);

		// Mostrar las palabras ordenadas
		System.out.println("Palabras ordenadas alfabéticamente:");
		for (String palabra : palabras) {
			System.out.println(palabra);
		}

		// Cerrar el scanner
		scanner.close();
	}

}
