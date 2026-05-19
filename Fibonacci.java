package recursividad;
import java.util.Scanner;
public class Fibonacci {

	public static int leerEntero () {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un numero entero positivo: ");
		int n = teclado.nextInt();
		return n;
	}
	
	public static int calcularFibonacci (int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		else {
			return calcularFibonacci(n-1) + calcularFibonacci(n-2);
		}
	}
	public static void main (String[] args) {
		int n = leerEntero();
		int resultado = calcularFibonacci(n);
		System.out.println("El numero de Fibonacci en la posicion " + n + " es: " + resultado);
	}
	
	
	
	
}
