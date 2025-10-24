import java.util.Scanner;

//leer por teclado como int la base y la altura de un triangulo y muestre por pantalla su area
//Controlar que la base y la altura no sea negativa
public class Ejercicio02 {

	public static void main(String[] args) {
		//Entrada de datos por teclado en modo consola
		Scanner sc;
		int base, altura;
		float area;

		//Instanciar el scanner
		sc = new Scanner(System.in);
		
		//Leer datos por teclado
		System.out.print("Introduce base del triangulo por teclado: ");
		base=sc.nextInt();
		
		System.out.print("Introduce altura del triangulo por teclado: ");
		altura=sc.nextInt();
		
		area=(float)base*altura/2;//Convierte la operacion el float
		
		//Mostrar el valor
		if(altura>0 && base>0) {
			System.out.println("El area del triangulo es: " + area);
		}else if(altura<=0) {
			System.out.println("La altura no pueden ser 0 o menores que 0");
		}else if(base<=0) {
			System.out.println("La base no pueden ser 0 o menores que 0");
		}
		
	}

}
