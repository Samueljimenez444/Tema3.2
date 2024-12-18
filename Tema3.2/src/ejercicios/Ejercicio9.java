package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int valor;
		String frase;
		String traduccion;
		int javalon = 0;
		int lenlen = 0;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduce la frase");
		frase = lectura.nextLine();
		valor = frase.indexOf("Javalin, javalon", 0);
		// Mientras el valor sea distinto a -1
		while (valor >= 0) {
			// El numero de veces de la palabra aumenta en uno
			// El valor pasa a valer el indice donde se encuentra la palabra
			valor = frase.indexOf("Javalin, javalon", valor + 1);
			javalon++;
		}
		valor = frase.indexOf("Javalin, len, len", 0);
		// Mientras el valor sea distinto a -1
		while (valor >= 0) {
			// El numero de veces de la palabra aumenta en uno
			// El valor pasa a valer el indice donde se encuentra la palabra
			valor = frase.indexOf("Javalin, len, len", valor + 1);
			lenlen++;
		}
		if (javalon > 0) {
			System.out.println("El dialecto es Javaliano");
			traduccion = frase.substring(17, frase.length());
			System.out.println(traduccion);
		} else if (lenlen > 0) {
			System.out.println("El dialecto es Javalenlen");
			traduccion = frase.substring(18, frase.length());
			System.out.println(traduccion);

		} else {
			System.out.println("La frase no es de un dialecto Javaliano");
			System.out.println(frase);
		}
		lectura.close();
	}

}
