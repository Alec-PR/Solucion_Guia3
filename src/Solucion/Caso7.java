package Solucion;

import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Nombre........: ");
		String nombre= sc.nextLine();
		
		for (int x = 1; x <= 10; x++)
			System.out.println(x + ".- Bienvenido(a)" + nombre + " al curso. ");
			

	}

}
