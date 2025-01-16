package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String frase;
				String camel=" ";
				char auxiliar;
				char ayuda;
				String[] palabras;
				Scanner lectura=new Scanner(System.in);
				System.out.println("Introduce una frase");
				frase=lectura.nextLine();
				palabras=frase.split(" ");
				palabras[0]=palabras[0].toLowerCase();
				System.out.print(palabras[0]);
				for(int i=1;i<palabras.length;i++){
				palabras[i]=palabras[i].toLowerCase();
				auxiliar=palabras[i].charAt(0);
				ayuda=Character.toUpperCase(auxiliar);
				camel=palabras[i].replace(palabras[i].charAt(0), ayuda);
				System.out.print(camel);
				
				}
				lectura.close();
			}
		}
