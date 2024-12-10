package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int longitud1;
		int longitud2;
		String frase1;
		String frase2;
		Scanner lectura=new Scanner(System.in);
		System.out.println("Introduce tu primera frase");
		frase1=lectura.nextLine();
		System.out.println("Introduce la segunda frase");
		frase2=lectura.nextLine();
		longitud1=frase1.length();
		longitud2=frase2.length();
		if(longitud1>longitud2){
			System.out.println("La primera frase es mayor a la segunda");
		}
		else if(longitud2>longitud1){
			System.out.println("La segunda frase es mayor a la primera");
		}
		else {
			System.out.println("Las frases son iguales");
		}

	}

}
