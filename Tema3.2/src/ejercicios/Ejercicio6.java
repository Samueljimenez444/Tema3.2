package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	static boolean palindromo(String frase) {
		// Incializamos el booleano palindromo a false
		boolean palindromo = false;
		// Creamos la variable fraseI que almacenara la frase del usuario invertida
		String fraseI = "";
		// Eliminamos los espacios de la frase
		frase = frase.replace(" ", "");
		// Bucle for
		for (int i = frase.length() - 1; i >= 0; i--) {
			// fraseF se ira formando en base a el caracter de la frase2 en funcion del
			// valor de i
			fraseI += frase.charAt(i);

		}
		// Eliminamos los espacios de la fraseI
		fraseI = fraseI.replace(" ", "");
		// Si las frases son iguales
		if (fraseI.equalsIgnoreCase(frase)) {
			// Palindromo es igual a true
			palindromo = true;
		}
		// Devolvemos el palindromo
		return palindromo;
	}

	public static void main(String[] args) {
		// Variable para almacenar la frase del usuario
		String frase;
		//Creacion Scanner
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduce una frase");
		// Definimos la frase en funcion del input del usuario
		frase = lectura.nextLine();
		System.out.println(palindromo(frase));
		// Cierre Scanner
		lectura.close();
	}

}
