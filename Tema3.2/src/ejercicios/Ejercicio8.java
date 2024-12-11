package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		String frase;
		String palabra;
		int comparacion;
		Scanner lectura=new Scanner(System.in);
		frase=lectura.nextLine();
		for(int i=0;i<frase.length();i++){
		if(frase.equals(" ")){
			palabra+=frase.substring(0,i);
		}
		comparacion=palabra.compareTo(palabra);
		}
	}

}
