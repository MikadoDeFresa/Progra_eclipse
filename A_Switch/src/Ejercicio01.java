
import java.util.Scanner;
public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc;
		int option, num, res=0;

		sc = new Scanner(System.in);
		do {
			System.out.println("1. Sumar pares");
			System.out.println("2. Sumar impares");
			System.out.println("3. Sumar todos(pares e impares)");
			System.out.println("4. Fin del programa");


			System.out.println("Introduce el número de la opción que quieras: ");
			option=sc.nextInt();


			switch(option) {
			case 1:
				res=0;
				do{
					System.out.println("Introduce números para sumar(0 para terminar): ");
					num=sc.nextInt();
					if(num%2==0) {
						res+=num;
					}
				}while(num!=0);
				System.out.println("La suma de los pares es: " + res);
				System.out.println();
				break;
			case 2:
				res=0;
				do{
					System.out.println("Introduce números para sumar(0 para terminar): ");
					num=sc.nextInt();
					if(num%2!=0) {
						res+=num;
					}
				}while(num!=0);
				System.out.println("La suma de los impares es: " + res);
				System.out.println();
				break;
			case 3:
				res=0;
				do{
					System.out.println("Introduce números para sumar(0 para terminar): ");
					num=sc.nextInt();
					res+=num;
				}while(num!=0);
				System.out.println("La suma de todo es: " + res);
				System.out.println();
				break;
			case 4:
				System.out.println("Hasta la próxima");
				break;
			}
		}while(option!=4);
	}
}
