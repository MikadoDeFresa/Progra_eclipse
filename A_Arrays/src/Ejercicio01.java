import java.util.Scanner;


/*PROGRAMA QUE HAGA LO SIGUNEITE:

 * 1. LLENAR IN ARRAY CON 10 NUMEROS ENTEROS LEIDOS POR TELCADO. AL PEDIR LOS NUMEROS INDICAR POR CUAL VAMOS:

 * Introduce 10 numeros_:

 * Numero 1:

 * Numero 2:

 * Numero 3:

 * ......  :

 * numero 10:

 */

public class Ejercicio01 {

	public static final int TAM = 20; //No cambia el valor en el programa, es constante y siempre en mayus
	public static void main(String[] args) {

		Scanner sc;
		int num;
		int cont=0;
		int []numeros; //Siempre son el mismo tipo de variable y empiezan en 0

		//INSTANCIAR 

		sc=new Scanner(System.in); 

		numeros=new int [TAM]; //No se pueden redimensionar

		//LLENAR EL ARRAY

		for(int pos=0;pos<TAM;pos++) {
			
			System.out.print("Numero "+(pos+1)+ ": ");
			num=sc.nextInt();
			numeros[pos]=num; //tambien puede ser numeros[pos]=sc.nextInt();
		}
		
		System.out.println("Los números guardados son:");
		
		for(int pos=0; pos<numeros.length; pos++) {
			cont++;
			if(cont==4) {
				System.out.println(numeros[pos] + " ");
				cont=0;
			} else {
				System.out.print(numeros[pos] + " ");
			}
		}
	}
}
