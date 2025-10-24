//Leer números enteros por teclado hasta que se teclee el -99 y mostrar cuantos positivos, cuantos negativos y cuantos nulos (valor 0).

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		int num, neg, pos, nul;
		Scanner sc;
		
		sc = new Scanner(System.in);
		num=0;
		neg=0;
		pos=0;
		nul=0;
		
		while(num!=-99) {
			System.out.print("Introduce un número (-99 para terminar):");
			num=sc.nextInt();
			
			if(num<0 && num!=-99) {
				neg++;
			} else if(num==0) {
				nul++;
			} else if(num>0) {
				pos++;
			}
		}
		System.out.println("Has introducido " + pos + " positivos, " + neg + " negativos y " + nul + " nulos.");
	}

}
