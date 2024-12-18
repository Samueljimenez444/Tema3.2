package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		String frase;
		int c;
		int cmayor=0;
		String[] palabras;
		Scanner lectura=new Scanner(System.in);
		frase=lectura.next();
		palabras=new String[frase.length()];
		palabras=frase.split(" ");
		c=palabras[0].length();
		c=cmayor;
		for(int i=0;i<palabras.length;i++){
			c=palabras[i].length();
			if(c>cmayor){
				cmayor=c;
			}
		}
		System.out.println(cmayor);
	}

}
