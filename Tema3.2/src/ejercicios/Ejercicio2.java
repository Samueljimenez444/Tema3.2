package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos la variable contraseña que servira para almacenar la contraseña del
		// jugador1
		String contraseña;
		// Creamos la variable jugdor que servira para almacenar la contraseña que elija
		// el jugador2
		String jugador;
		// Creamos la variable entera comparador y la inicializamos a 1 esta variable
		// servira para comparar alfabeticamente las dos contraseñas
		int comparador = 1;
		// Creamos el objeto Scanner
		Scanner lectura = new Scanner(System.in);
		// Print
		System.out.println("Jugador 1 introduce la contraseña (NO SE PERMITEN ESPACIOS");
		// Contraseña es igual al input del usuario
		contraseña = lectura.next();
		System.out.println("Jugador 2 Introduce la contraseña (NO SE PERMITEN ESPACIO)");
		// Jugador es igual al input del usuario
		jugador = lectura.next();
		// Comparador es igual a el numero (negativo positivo o cero) que sale despues
		// de comparar alfabeticamente las cadenas
		comparador = contraseña.compareToIgnoreCase(jugador);
		// Mientras el comparador sea distinto a 0 (Es decir las contraseñas no sean
		// iguales)
		while (comparador != 0) {

			// Si el comparador es mayor a 0 la cadena es mayor alfabeticamente
			if (comparador > 0) {
				System.out.println("La cadena es mayor");
			}
			// Si el comparador es menor a 0 la cadena es menor alfabeticamente
			else if (comparador < 0) {
				System.out.println("La cadena es menor");
			}
			// Print
			System.out.println("Jugador 2 introduce la contraseña");
			// Jugador es igual al input del usuario
			jugador = lectura.next();
			// Comparador es igual a la comparacion alfabetica
			comparador = contraseña.compareToIgnoreCase(jugador);
		}
		// Print del ganador
		System.out.println("Has ganado jugador 2");
		// Cierre de Scanner
		lectura.close();
	}

}
