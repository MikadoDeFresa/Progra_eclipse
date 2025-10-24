/*Leer una nota númerica entera por teclado y muestre esa nota en forma de texto según esta tabla:
*0-3 MD/OG
*3-5 INS/GU
*5-6 SF/NH
*6-7 BN/OG
*7-9 NT/OO
*10 SB/BK
*
*Ejemplo:
*Introduce una nota(0-10): 15
*Nota no válida -> Se acaba el programa
*
*Introduce una nota(0-10): 7
*Has sacado un NT/OG
*/

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc;
		int nota;
		
		sc = new Scanner(System.in);
		
		System.out.print("Introduce una nota(0-10):");
		nota=sc.nextInt();
		
		switch(nota) {
			case 0, 1, 2: System.out.println("Has sacado Muy deficiente/Oso Gutxi"); //Forma de agrupar case
				break;
			case 3:
			case 4: System.out.println("Has sacado Insuficiente/Gutxi");
				break;
			case 5: System.out.println("Has sacado Suficiente/Nahikoa");
				break;
			case 6: System.out.println("Has sacado Bien/Ongi");
				break;
			case 7:
			case 8:
			case 9: System.out.println("Has sacado Notable/Oso Ondo"); //Forma de agrupar case
				break;
			case 10: System.out.println("Has sacado Sobresaliente/Bikain");
				break;
			default: System.out.println("Nota no válida"); //Todos los demás case
		}
	}

}
