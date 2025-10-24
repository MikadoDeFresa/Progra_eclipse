/*lea un número entero por teclado y muestre por pantalla los múltiplos de 3 desde el 1 hasta el número introducido por teclado.
*EJEMPLO:
*INTRODUCE UN NUMERO: 41
*Los múltiplos de 3 desde el 1 al 41 son: 	3 6 9 12 15 18 ......... 39*/

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sc;
		int fin;
		int mul=3;
		
		sc = new Scanner(System.in);
		
		System.out.print("Introduce un número:");
		fin=sc.nextInt();
		
		
		if(fin<3) {
			System.out.println("No existen multiplos de " + mul + " con el número introducido.");
			return;
		}else {
			System.out.println("Los múltiplos de " + mul + " desde el 1 al " + fin + " son:");
			for (int i = mul; i <= fin; i+=mul) {
	            System.out.print(i + " ");
			}
		}
	}

}
