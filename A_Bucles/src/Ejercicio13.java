//Leer un número entero y mostrar su tabla de multiplicar del 1 al 10
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		int num;
		Scanner sc;
		
		sc=new Scanner(System.in);
		
		System.out.println("Introduce un número para calcular su tabla de multiplicar: ");
		num=sc.nextInt();
		
		for(int cont=1; cont<=10; cont++) {
			System.out.println(num + " x " + cont + "=" + num*cont);
		}
	}
}
