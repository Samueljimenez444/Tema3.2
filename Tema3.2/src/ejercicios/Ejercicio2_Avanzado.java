package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2_Avanzado {

	public static void main(String[] args) {
		//Creamos una variable para almacenar la contraseña del jugador1
		String contraseñas;
		//Creamos una variable para almacenar la eleccion del jugador2
		String jugador2;
		//Creamos una variable para almacenar la longitud de la cadena del jugador
		int longitud=0;
		/*Creamos 3 arrays de caracteres para almacenar las contraseñas dentro y mostrarlas de forma gradual*/
		char[] contraseña;
		char[] jugador;
		char[] mostrada;
		//Creamos el objeto scanner
		Scanner lectura=new Scanner(System.in);
		//Print
		System.out.println("Introduce la contraseña Jugador1");
		//Contraseña es igual a el input del usuario
		contraseñas=lectura.next();
		longitud=contraseñas.length();
		contraseña=new char[longitud];
		jugador=new char[longitud];
		mostrada=new char[longitud];
		for(int i=0;i<mostrada.length;i++){
			mostrada[i]='*';
		}
		for(int i=0;i<contraseña.length;i++){
			contraseña[i]=contraseñas.charAt(i);
		}
		System.out.println("La contraseña tiene una longitud de " +longitud);
		System.out.println("Introduce la contraseña Jugador2");
		jugador2=lectura.next();
		for(int i=0;i<jugador.length;i++){
			jugador[i]=jugador2.charAt(i);
		}
		while(jugador.equals(contraseña)){
			for(int i=0;i<jugador.length;i++){
			if(jugador[i]==contraseña[i]){
				mostrada[i]=contraseña[i];
			}
			
			}
			System.out.println(mostrada);
			System.out.println("Introduce la contraseña Jugador2");
			jugador2=lectura.next();
			for(int i=0;i<jugador.length;i++){
				jugador[i]=jugador2.charAt(i);
			}
			
		}
		System.out.println("Has ganado Jugador2");
		lectura.close();
	}

}
