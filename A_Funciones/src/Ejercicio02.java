//Calcular factorial de numeros introducidos por teclado hasta que se introduzca el -99
//Funcion que calcule un factorial de un numero int recibido como parametro y delvuelva su resultado double

import java.util.Scanner;
public class Ejercicio02 {
	
	public static final int TAM = 10;
	public static void main(String[] args) {
		Scanner sc;
		int num1, nimpar[];
		
		sc = new Scanner(System.in);
		nimpar=new int [TAM];
		
		do {
			System.out.println("Introduce un número: ");
			num1=sc.nextInt();
			
			if(num1==-99) {
				break;
			} else if (num1>=0){
				double result = factorial(num1);
				System.out.println("El resultado es:" + result);
			} else {
				System.out.println("No es un número valido");
			}
			}while(num1!=-99);

		//Llenar un array de 10 elementos con los 10 primeros numeros impares positivos (funcion)
		llenar(nimpar);
		mostrar(nimpar);

	}
	
	public static double factorial(int n1) {
		double res=1;
		for(int i=1; i<=n1; i++) {
			res*=i;
		}
		return res;
	}
	
	public static int[] llenar(int num[]) {
		for (int i = 0; i < num.length; i++) {
            num[i] = 2 * i + 1;
        }
		return num;
	}
	
	public static int[] mostrar(int array[]) {
		System.out.print("Array impares: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
		return array;
	}

}
