//Pedir base y exponente de la potencia y llama a la funcion
//Funcion que reciba como parametros dos numeros enteros y que devuelva double la potencia del primer numero elevado al segundo sin funcion pow

import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc;
		int num1 , num2;
		
		sc = new Scanner(System.in);
		
		System.out.println("Introduce el número base: ");
		num1=sc.nextInt();
			
		System.out.println("Introduce el número exponente: ");
		num2=sc.nextInt();
		
		potencia(num1, num2);
	}
	
	public static double potencia (int n1, int n2) {
		double res=1;
		if(n2>0) {
			for(int i=0; i<n2; i++) {
				res*=n1;
			}
			System.out.println("El resultado de la potencia es " + res);
		} else if (n2==0) {
			System.out.println("El resultado de la potencia es " + res);
		} else {
			for(int i=0; i>n2; i--) {
				res*=n1;
			}
			res=1/res;
			System.out.println("El resultado de la potencia es " + res);
		}	
		return res;
	}
}
