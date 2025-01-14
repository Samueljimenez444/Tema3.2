package ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
	public static String codificador(String frase) {
		int auxiliar;
		int random;
		boolean igual=true;
		Random rand=new Random();
		random=rand.nextInt(1,frase.length());
		char[]original=new char[frase.length()];
		char[] codificar=new char[frase.length()];
		codificar=frase.toCharArray();
		original=frase.toCharArray();
		
		for(int i=0;i>frase.length();i++){
		random=rand.nextInt(1,frase.length());
		codificar[random]=codificar[i];
		auxiliar=codificar[random];
		codificar[i]=(char)auxiliar;
				
		}
		
		return frase;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String frase1;
	String frase2;
	
	Scanner lectura=new Scanner(System.in);
	System.out.println("Introduce una frase");
	frase1=lectura.nextLine();
	System.out.println(codificador(frase1));
	}

}
