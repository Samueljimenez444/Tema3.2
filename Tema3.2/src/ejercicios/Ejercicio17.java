package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		String sentencia;
		String traduccionC=" ";
		String[] palabras;
		Scanner lectura=new Scanner(System.in);
		System.out.println("Introduce una sentencia en C");
		sentencia=lectura.nextLine();
		palabras=sentencia.split("/");
		
		for(int i=0;i<palabras.length;i++){
			if(i%2==0){
				traduccionC+=palabras[i];
			}
			else if(i%2!=0){
				
			}
		}
		
		System.out.println("La traduccion sin comentarios es" +traduccionC);
		lectura.close();
	}
}
