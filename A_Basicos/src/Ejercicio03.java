//Leer dos numeros enteros por teclado, guardarlos en dos variables y mostrar, intercambiar sus valores y volver a mostrar

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc;
		int num1, num2, aux;
		
		sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer número por teclado: ");
		num1=sc.nextInt();
		
		System.out.print("Introduce el segundo número por teclado: ");
		num2=sc.nextInt();
		
		System.out.println("El primer número es: " + num1);
		System.out.println("El segundo número es: " + num2);
		
		aux=num1;
		num1=num2;
		num2=aux;
		
		System.out.println("Intercambiados:");
		System.out.println("El primer número es: " + num1);
		System.out.println("El segundo número es: " + num2);
	}

}
