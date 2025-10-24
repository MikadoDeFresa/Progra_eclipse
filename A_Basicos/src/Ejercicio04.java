//Leer dos números por teclado y mostrar en pantalla en orden ascendente

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc;
		int num1, num2;
		
		sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer número por teclado: ");
		num1=sc.nextInt();
		
		System.out.print("Introduce el segundo número por teclado: ");
		num2=sc.nextInt();
		
		System.out.println("Números ordenados:");
		
		if(num1>num2) {
			System.out.println(num2 + " " + num1);
		}else if (num1==num2){
			System.out.println(num1 + "=" + num2);
		}else {
			System.out.println(num1 + " " + num2);
		}
	}

}
