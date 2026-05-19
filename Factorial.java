package recursividad;

import java.util.Scanner;
public class Factorial {
	
	public static int leerEnteroPositivo() {
		Scanner teclado = new Scanner(System.in);
		int n;
		do {
			System.out.println("Ingrese un numero entero positivo: ");
			n = teclado.nextInt();
		} while (n < 0);
		return n;
	}
	
	public static int calcularFactorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * calcularFactorial(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		int n = leerEnteroPositivo();
		int resultado = calcularFactorial(n);
		System.out.println("El factorial de " + n + " es: " + resultado);
	}
	
}
