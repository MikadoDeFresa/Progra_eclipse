//Escribe por teclado un numero de personas (Tamaño array) y crear dos arrays para guardar los nombres y edades y mostrar solo mayores de 18
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int tam, num;
		String nombres[];
		int edades[];
		Scanner sc;
		
		sc=new Scanner(System.in);
		
		System.out.println("¿Cuántas personas quieres? ");
		num=sc.nextInt();
		
		nombres= new String [num];
		edades= new int [num];
		
		for(int pos=0; pos<num; pos++) {
			System.out.print("Introduce nombre " + (pos+1) + ": ");
			nombres[pos] = sc.next();
			System.out.print("Introduce edad de nombre " + (pos+1) + ": ");
			edades[pos]= sc.nextInt();
		}
		
		System.out.println("Los mayores de 18 son:");
		
		for(int pos=0; pos<num; pos++) {
			if(edades[pos]>17) {
				System.out.print(nombres[pos] + " " + edades[pos] + ", ");
			}
		}
	}
}
