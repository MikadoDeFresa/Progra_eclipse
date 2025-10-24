//Leer un numero entero de alumnos matriculados (>0) pedir nota por numero entero de cada alumno y mostrar el numero de aprobados y la nota media.
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int alum=0, nota=-1, aprob=0, media=0;
		String palabra;
		Scanner sc;
		
		sc= new Scanner(System.in);
		
		
		
		while(alum<=0) {
			System.out.println("Introduce el número de alumnos:");
			alum=sc.nextInt();
		}
		
		System.out.println("Introduce nota de alumnos:");
		
		for(int cont=1; alum>=cont; cont++) {
			System.out.println("Alumno " + cont + ": ");
			nota=sc.nextInt();
			
			if(nota<0 || nota>10) {
				System.out.println("Introduce nota del alumno" + cont + ":");
				nota=sc.nextInt();
			} else {
				media+=nota;
				if(nota>=5) {
					aprob++;
				}
			}
		}
		media/=alum;
		System.out.println("El número de aprobados es: " + aprob);
		System.out.println("La nota media es: " + media);
	}
}

