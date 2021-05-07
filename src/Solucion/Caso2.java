package Solucion;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		int x=1;       // contador
		int suma=0;    // acumulador
		
		while (x <= n) {
			suma +=x;
			
			if (x < n)
				System.out.print(x + " + ");
			else
				System.out.println(x + " = " + suma);
			
			x++;
			
		}
			
		//System.out.println("\nResultados");
		//System.out.println("------------");
		//System.out.println("Sumatoria...: " + suma);
		
		
	}

}
