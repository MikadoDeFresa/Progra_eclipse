/* Leer un numero entero y mostrar el resultado factorial
 * Si el numero es mayor que 0 -> calcular el resultado haciendo varias multiplicaciones
 */

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		int num;
		double resultado=1;
		String respuesta;
		Scanner sc;
		
		sc=new Scanner(System.in);
		
		do {
			do {
				System.out.println("Introduce el número del que quieras saber el factorial(>0): ");
				num=sc.nextInt();
				
			}while(num<0);
			
			for(int i=1; i<=num; i++) {
				resultado= resultado * i;
			}
			
			System.out.println("El factorial del número es: " + resultado);
			System.out.println("¿Quieres calcular otro factorial? (S/N): ");
			respuesta=sc.next();

		}while(respuesta.equalsIgnoreCase("S")); //Ignora todos los valores menos el introducido y lee las mayus y las minus
	}
}
