//Llena un array de 30 elementos con numeros aleatorios enteros positivos en 1 y 100 ambos incluidos
public class Ejercicio02 {

	public static final int TAM = 30;
	public static void main(String[] args) {
		
		int num, max=100, min=1;
		int numeros[];
		
		numeros=new int [TAM];
		
		for(int pos=0; pos<TAM; pos++) {
			num= (int)(Math.random() * (max + min)); //(int)para que sea un numero entero
			numeros[pos]=num; //Guardar en el array
		}
		
		System.out.println("30 números aleatorios (1-100):");
		
		for(int pos=0; pos<TAM; pos++) {
			if((pos+1)%6==0){ //el 0 no entra en el multiplo y se necesita para la posicion 0 del array
				System.out.println(numeros[pos] + " ");
			} else {
				System.out.print(numeros[pos] + " ");
			}
		}
		
		System.out.println("Ahora al reves:");
		
		for(int pos=TAM; pos>0; pos--) {
			if((pos-1)%6==0){ //el 30 no es una posicion del array sino el 29
				System.out.println(numeros[pos-1] + " ");
			} else {
				System.out.print(numeros[pos-1] + " ");
			}
		}
		/* TAMBIEN PUEDE SER CON CONTADOR O CON:
		 * for(int pos=TAM-1; pos>=0; pos--) {
		 * System.out.print(numeros[pos] + " ");
		 * if(pos%6==0){
		 * 		System.out.println();
		 * }	
		}*/
	}
}