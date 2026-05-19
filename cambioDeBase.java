package recursividad;
import java.util.Scanner;

public class cambioDeBase {
    public static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int n = teclado.nextInt();
        return n;
    }
    
    public static String obtenerDigito(int resto) {
        if (resto < 10) {
            return String.valueOf(resto); 
        } else {
            char letra = (char) ('A' + (resto - 10)); 
            return String.valueOf(letra);
        }
    }

    public static String decimalAHexadecimal(int n) {
        if (n < 16) {
            return obtenerDigito(n);
        } 
        else {
            return decimalAHexadecimal(n / 16) + obtenerDigito(n % 16);
        }
    }

    public static void main(String[] args) {
        int numero = leerNumero();
        String resultado = decimalAHexadecimal(numero);
        System.out.println("El numero en hexadecimal es: " + resultado);
    }
}