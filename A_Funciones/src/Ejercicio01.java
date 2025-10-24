//Leer por teclado dos numeros y muestre por pantalla la suma
//Funcion que realice la suma de dos numeros recibidos como parametros y devuelva esa suma

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc;
		int num1, num2, result;
		
		sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		num1=sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		num2=sc.nextInt();
		
		result=sumar(num1,num2);
		System.out.print("El resultado de la suma es: " + result);
	}
	
	public static int sumar(int n1, int n2){
		int res;
		res = n1 + n2;
		return res;
	}

}
