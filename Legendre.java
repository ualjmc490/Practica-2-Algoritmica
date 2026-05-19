package recursividad;
import java.util.Scanner;
public class Legendre {

	public static int leerGrado() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el grado del polinomio de Legendre: ");
		int n = teclado.nextInt();
		return n;
	}
	
	public static double leerValorX() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el valor de x: ");
		double x = teclado.nextDouble();
		return x;
	}
	
	public static double calcularLegendre(int n, double x) {
		if (n == 0) {
			return 1;
		} else if (n ==1) {
			return x;
		} else {
			return ((2*n -1)*x*calcularLegendre(n-1, x) - (n-1) * calcularLegendre(n-2, x)) /n;
		}
	}
	public static void main(String[] args) {
		int n = leerGrado();
		double x = leerValorX();
		double resultado = calcularLegendre(n, x);
		System.out.println("El valor del polinomio de Legendre de grado " + n + " en x = " + x + " es:" + resultado);
	}
}
