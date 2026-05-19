package recursividad;
import java.util.Scanner;

public class mcd { 

	public static int leerM() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer valor (m): ");
		int m = teclado.nextInt();
		return m;
	}
	
	public static int leerN() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el segundo valor (n): ");
		int n = teclado.nextInt();
		return n;
	}
	
	public static int calcularMCD(int m, int n) {
		if (n <= m && m % n == 0) {
		    return n;
		} 
		else if (m < n) {
			return calcularMCD(n, m); 
		} 
		else {
			return calcularMCD(n, m % n);
		}
	}
	
	public static void main(String[] args) {
		int m = leerM();
		int n = leerN();
		int resultado = calcularMCD(m, n);
		System.out.println("El MCD de " + m + " y " + n + " es: " + resultado);
	}
}