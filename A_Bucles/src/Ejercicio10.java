//leer una palabra por teclado y luego leer un número entero por teclado y seguir pidiendo numeros hsta que se introduzca un numero positivo mostrar la palabra leida tantas veces como el número.

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int num=0, cont=1;
		String palabra;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra:");
		palabra=sc.nextLine();
		
		while(num<=0) {
			System.out.println("Introduce una número positivo:");
			num=sc.nextInt();
			while(cont<=num) {
				System.out.println(cont + ". " + palabra);
				cont++;
			}
		}	
	}
}
