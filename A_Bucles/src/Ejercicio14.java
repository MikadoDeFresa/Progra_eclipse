//Pensar un número entero aleatorio entre 1 y 1000 (Mostrar en la fase de pruebas)
// El usuario debe adivinar el numero en un max de 10 intentos
// En cada intento nos diga en que rango de valores esta el numero
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		int num, intento, cont=10, min=1, max=1000;
		boolean acertado = false;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		num=(int)(Math.random() * (max - min + 1) + min);
		
		System.out.println("Adivina el número entre " + min + "  y " + max + " que estoy pensando: ");
		intento=sc.nextInt();
	
		 for(int i=1; i<10; i++) {
			 if (intento<1 || intento>1000) {
				System.out.println("El número no esta entre " + min + " y " + max + ", introduce otro número: ");
				intento=sc.nextInt();
			 } else {
				 if(num>intento) {
					 	min=intento;
					 	cont--;
						System.out.println("Te quedan " + cont + " intentos. Introduce un número entre " + min + " y " + max + ": ");
						intento = sc.nextInt();
					} else if (num<intento) {
						max=intento;
						cont--;
						System.out.println("Te quedan " + cont + " intentos. Introduce un número entre " + min + " y " + max + ": ");
						intento = sc.nextInt();
					} else {
						acertado = true;
						break;
					}
			 }
		 }
		 
		 if(acertado) {
			 System.out.println("¡Enhorabuena! Has acertado, el número era " + num);
		 } else {
			 System.out.println("Has perdido. El número era " + num);
		 }
	}
		 
}
