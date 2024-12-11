package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
	static String invertir(String frase2) {
		//Creamos la variable fraseF que servira para invertir la frase que entra por la funcion
		String fraseF="";
		
		//Bucle for
		for(int i=frase2.length()-1;i>=0;i--){
			//fraseF se ira formando en base a el caracter de la frase2 en funcion del valor de i
			fraseF+=frase2.charAt(i);
			
		}
		//Devolvemos la fraseF
		return fraseF;
	}
	public static void main(String[] args) {
		//Creamos una variable frase1 para almacenar la frase del usuario
		String frase1;
		//Creamos el objeto Scanner
		Scanner lectura=new Scanner(System.in);
		//Print 
		System.out.println("Introduce la frase");
		//Frase1 sera igual al input del usuario
		frase1=lectura.nextLine();
		//Print de la frase invertida
		System.out.println(invertir(frase1));
		//Cierre Scanner
		lectura.close();
		
	}

}
