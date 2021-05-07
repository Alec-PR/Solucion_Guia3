package Solucion;

public class Caso1 {

	public static void main(String[] args) {
		
		System.out.println("\nWHILE - Contador ascendente");
		System.out.println("-----------------------------");
		
		int x= 1;
		
		while (x <= 5) {
			System.out.println("Bienvenido" + x);
			x++;
		}
		
		System.out.println("\nWHILE - Contador descendente");
		System.out.println("------------------------------");
		
		int c = 5;
		
		while (c >= 1) {
			System.out.println("Bienvenido" + c);
			c -= 1;
		}

	}

}
