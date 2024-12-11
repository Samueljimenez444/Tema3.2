package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	static String buscador(String frase, String palabra) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		String palabra;
		Scanner lectura=new Scanner(System.in);
		System.out.println("Introduce la frase");
		frase=lectura.next();
		System.out.println("Introduce la palabra que quieres buscar");
		palabra=lectura.next();
		System.out.println(buscador(frase,palabra));
	}

}
