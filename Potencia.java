package recursividad;
import java.util.Scanner;
public class Potencia {

	public static int leerBase() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la base: ");
		int x = teclado.nextInt();
		return x;
	}
	
	public static int leerExponente() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el exponente: ");
		int n = teclado.nextInt();
		return n;
	}

	
	public static int calcularPotencia(int x, int n) {
		if (n == 0) {
			return 1;
		}else {
			return x * calcularPotencia(x, n-1);
		}
	}
	
	public static void main(String[] args) {
		int x = leerBase();
		int n = leerExponente();
		int resultado = calcularPotencia(x,n);
		System.out.println("El resultado de " + x + " elevado a la " + n + " es: " + resultado);
	}

}
