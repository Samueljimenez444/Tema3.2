package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	static int espacio(String frases){
		//Variable para almacenar el numero de espacios
		int espacios=0;
		//Creamos un array de caracteres que almacenara la frase
		char[] frase;
		//El array tendra la longitud de la frase
		frase=new char[frases.length()];
		//Creamos un bucle for 
		for(int i=0;i<frases.length();i++){
			//La frase en i sera igual a el caracter de la frase en la posicion i
			frase[i]=frases.charAt(i);
			//Si la frase en la posicion i es un espacio el numero de espacio aumenta en 1
			if(frase[i]==' '){
				espacios++;
			}
		}
		//Devolvemos el numero de espacios de la frase
		return espacios;
	}
	public static void main(String[] args) {
		//Creamos una variable frase que almacenara la frase del usuario
		String frase;
		//Creamos el objeto Scanner
		Scanner lectura=new Scanner(System.in);
		//Print instrucciones usuario
		System.out.println("Introduce una frase");
		//Leemos la frase y la almacenamos en la variable frase
		frase=lectura.nextLine();
		//Print del numero de espacios
		System.out.println("El numero de espacios es " +espacio(frase));
		//Cierre Scanner
		lectura.close();
	}

}
