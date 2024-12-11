package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Creamos la variable palabra para almacenar las palabras que va introduciendo el usuario
		String palabra;
		//Creamos la variable frase para crear la frase con las palabras del usuario
		String frase="";
		//Creamos la variable frase final para mostrar la frase sin la palabra fin
		String fraseFinal;
		//Creamos el objeto Scanner
		Scanner lectura=new Scanner(System.in);
		//Print
		System.out.println("Introduce palabras para formar una frase");
		//Palabra es igual al input del usuario
		palabra=lectura.next();
		//Formamos la frase con concatenacion de la palabras
		frase+=palabra+" ";
		//Creamos un bucle while que finalizara cuando el usuario introduzca la palabra fin
		while(!(palabra.equalsIgnoreCase("fin"))) {
			//Print
			System.out.println("Introduce palabras para formar una frase");
			//Seguimos preguntando palabras
			palabra=lectura.next();
			//Seguimos creando la frase concatenando la palabra
		frase+=palabra+" ";
		}
		//Definimos la frase final
		fraseFinal=frase.substring(0,frase.length()-4);
		//Print
		System.out.println(fraseFinal);
		//Cierre Scanner
		lectura.close();
	}

}
