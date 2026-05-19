package recursividad;
import java.util.Scanner;
public class Ackermann {

	public static int leerValor1() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un valor entero no negarivo: ");
		int n = teclado.nextInt();
		return n;
	}
	public static int leerValor2() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un valor entero no negativo: ");
		int m= teclado.nextInt();
		return m;
	}
	
	public static int calcularAckermann(int m, int n) {
		if (m == 0) {
			return n+1;
		} else if (m != 0 && n == 0) {
			return calcularAckermann(m-1, 1);
		} else {
			return calcularAckermann(m-1, calcularAckermann(m, n-1));
		}
	}
	
	public static void main(String[] args) {
		int m = leerValor1();
		int n = leerValor2();
		int resultado = calcularAckermann(m, n);
		System.out.println("El valor de la funcion de Ackerman para m = " + m + " y n = " + n + " es: " + resultado);
	}
}
