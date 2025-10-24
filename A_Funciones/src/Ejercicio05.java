//Funcion que reciba como parametros una array de numeros enteros y dos numeros y el valor verdadero solo si los dos numeros estan en el array sino falso

import java.util.Scanner;
import java.util.Scanner;
public class Ejercicio05 {
	
	public static final int TAM = 20;
	public static void main(String[] args) {
		int nums1[], com1=0, com2=0;
		boolean encontrado;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		nums1=new int [TAM];
		
		llenar(nums1);
		mostrar(nums1);

		System.out.println("Introduce un numero:");
		com1=sc.nextInt();
		
		System.out.println("Introduce un numero:");
		com2=sc.nextInt();
		
		encontrado=comprobar(nums1, com1, com2);
		
		if(encontrado==true) {
			System.out.println("Los dos numeros se encuentran en el array");
		} else {
			System.out.println("Los dos numeros no se encuentran en el array");
		}
		
	}
	
	public static int[] llenar(int n[]) {
		int num, max=100, min=1;
		for(int pos=0; pos<n.length; pos++) {
			num= (int)(Math.random() * (max - min) + min);
			n[pos]=num;
		}
		return n;
	}
	
	public static int[] mostrar(int n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
		return n;
	}
	
	public static boolean comprobar(int array[], int n1, int n2) {
		boolean com1=false, com2=false;
		for(int i=0; i<array.length; i++) {
			if (array[i]==n1) {
				com1=true;
			}
			if(array[i]==n2) {
				com2=true;
			}
		}
		return (com1&&com2);//si se cumple devuelve true y sino false
	}
}
