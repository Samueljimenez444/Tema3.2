package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos la variable tipo string frase que almacenara la frase del usuario
		String frase;
		// Creamos la variable contador que servira para contar el numero de veces que
		// aparezca las letras
		int contador = 0;

		//Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		//Print de instrucciones
		System.out.println("Introduzca una frase");
		//Leemos la frase del usuario y la pasamos a mayusculas
		frase = lectura.nextLine().toUpperCase();
		/*Creamos un bucle for encadenado que buscara en la frase la letra y si la encuentra lo mostrara por consola*/
		for (char letra = 'A'; letra < 'Z'; letra++) {
			if (contador != 0) {
				letra--;
				System.out.println( letra  + " " + contador);
				letra++;

			}
			contador=0;
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == letra) {

					contador++;

				}
				
				
			}
		}
	}
}
