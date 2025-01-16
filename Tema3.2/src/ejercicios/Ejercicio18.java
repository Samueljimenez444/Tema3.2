package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		String titulo;
		String h1;
		String contenido;
		String p;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Introduzca el titulo de la pagina");
		titulo = lectura.nextLine();
		System.out.println("Introduzca el contenido de la pagina");
		contenido = lectura.nextLine();
		h1=("<h1> " + titulo +" </h1>");
		p=("<p> " + contenido +" </p>");
		System.out.println(h1);
		System.out.println(p);
		lectura.close();
	}
}
