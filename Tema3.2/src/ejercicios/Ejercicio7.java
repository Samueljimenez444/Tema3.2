package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
	static int buscador(String frase, String palabra) {
		//Creamos una variable entera para almacenar el valor donde se encuentra la cadena
		int valor=0;
		//Creamos una variable entera para almacenar el numero de veces que se encuentra la palabra
		int veces=0;
		//Buscamos la palabra en la frase y adjuntamos su indice a el valor
		valor=frase.indexOf(palabra,0);
		//Mientras el valor sea distinto a -1
		while(valor>=0) {
			//El numero de veces de la palabra aumenta en uno
			veces++;
			//El valor pasa a valer el indice donde se encuentra la palabra
			valor=frase.indexOf(palabra,valor+palabra.length());
		
		}
		return veces;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int veces;
		//Variable donde se almace la frase
		String frase;
		//Variable para almacenar la frase que quiere buscar el usuario
		String palabra;
		//Creacion Scanner
		Scanner lectura=new Scanner(System.in);
		//Print
		System.out.println("Introduce la frase");
		//Frase es igual al input del usuario
		frase=lectura.nextLine();
		//Print
		System.out.println("Introduce la palabra que quieres buscar");
		//Palabra es igual al input del usuario
		palabra=lectura.nextLine();
		//Numero de veces que se encuentra la palabra
		veces=buscador(frase,palabra);
		System.out.println(veces);
		//Cierre Scanner
		lectura.close();
	}

}
