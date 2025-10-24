//Llena un array de 15 numeros entre el 1 y el 100 y mostrar en una linea
//Desplazar todos una posicion a la derecha y el ultimo el primero y volver a mostrar
public class Ejercicio06 {

	public static final int TAM = 15;
	public static void main(String[] args) {
		
		int num, max=50, min=1, ultimo;
		int numeros[];
		
		numeros=new int [TAM];
		
		for(int pos=0; pos<TAM; pos++) {
			num= (int)(Math.random() * (max + min));
			numeros[pos]=num;
			System.out.print(numeros[pos] + " ");
		}
		
        System.out.println();
        
        // Desplazar todos una posición a la derecha
        ultimo = numeros[TAM-1]; // Guardar el último elemento
        
        for(int pos=TAM-1; pos>0; pos--) {
            numeros[pos] = numeros[pos-1]; // Desplazar a la derecha
        }
        
        numeros[0] = ultimo; // El último pasa a la primera posición
        
        // Mostrar el array desplazado
        for(int pos=0; pos<TAM; pos++) {
            System.out.print(numeros[pos] + " ");
        }
	}
}
