//Array de 5 filas y 10 columnas
//Llenar con numeros aleatorios de dos digitos y mostrar
//pedir por teclado dos numeros de fila e intercambiar las filas y mostrar

import java.util.Scanner;

public class Ejercicio09 {
	
	public static final int FILA = 5;
	public static final int COL = 10;
	public static void main(String[] args) {
		Scanner sc;
		int numeros[][], num, min=10, max=99, fila1=1, fila2=1, aux;
		
		sc = new Scanner(System.in);
		
		numeros=new int [FILA][COL];
		aux=0;
		
		for(int pos=0; pos<FILA; pos++) {
			System.out.print("Fila " + (pos+1) + ": ");
			for(int pos2=0; pos2<COL; pos2++) {
				num= (int)(Math.random() * (max - min) + min);//max - min define el tamaño del rango y + min ajusta el punto de inicio del rango
				numeros[pos][pos2]=num;
				System.out.print(numeros[pos][pos2] + " ");
			}
			System.out.println();
		}
		
		do {
			System.out.println("Introduce las filas que quieres intercambiar(1-5):");
			System.out.println("Fila:");
			fila1=sc.nextInt();
			System.out.println("Fila:");
			fila2=sc.nextInt();
		} while(fila1<1 || fila1>FILA || fila2<1 || fila2>FILA);
		
		

		for(int pos=0; pos<COL; pos++) {
			aux=numeros[fila1-1][pos];
			numeros[fila1-1][pos]=numeros[fila2-1][pos];
			numeros[fila2-1][pos]=aux;
		}
		
		for(int pos=0; pos<FILA; pos++) {
			System.out.print("Fila " + (pos+1) + ": ");
			for(int pos2=0; pos2<COL; pos2++) {
				System.out.print(numeros[pos][pos2] + " ");
			}
			System.out.println();
		}
	}
}
