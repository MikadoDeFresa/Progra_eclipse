//lea dos números por teclado y muestre todos los números que hay entre ambos, de menor a mayor.

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc;
		int num1, num2;
		
		sc = new Scanner(System.in);
		
		System.out.print("Introduce un número:");
		num1=sc.nextInt();
		
		System.out.print("Introduce otro número:");
		num2=sc.nextInt();
		
		if(num1==num2) {
			System.out.println("No introducir dos números iguales");
		}
		
		while(num1!=num2) {
			if(num1<num2) {
				System.out.print(num1 + " ");
				num1++;
			}else {
				System.out.print(num2 + " ");
				num2++;
			}
		}
	}
}
