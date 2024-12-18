package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
	static char codifica(char conjunto1[], char conjunto2[], char letra) {
		int contador = 0;
		boolean found = false;
		while (contador < conjunto1.length && !found) {
			if (conjunto1[contador] == letra) {
				letra = conjunto2[contador];
				found = true;
			}
			contador++;
		}

		return letra;
	}

	public static void main(String[] args) {
		char[] c2 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char[] c1 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		String frase;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduce una frase y la codificaremos");
		frase = lectura.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			System.out.print(codifica(c1, c2, frase.charAt(i)));
		}
	}

}
