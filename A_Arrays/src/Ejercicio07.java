//Llenar un arra con 20 numeros positivos enteros de dos digitos y mostrarlo
//Despues ordenarlos de forma ascendente y volver a mostrar
public class Ejercicio07 {
	
	public static final int TAM = 20;
	public static void main(String[] args) {
		int num, max=100, min=10, aux;
		int numeros[];
		boolean orden;
		
		numeros=new int [TAM];
		
		for(int pos=0; pos<TAM; pos++) {
			num= (int)(Math.random() * (max - min) + min);
			numeros[pos]=num;
			System.out.print(numeros[pos] + " ");
		}
		aux=numeros[0];
		//METODO DE LA BURBUJA
		for(int pos=0; pos<TAM; pos++) { //Se repite tantas veces como el tamaño del array
			orden = true;
			for(int pos2=0; pos2<TAM-pos-1; pos2++) { //Se repite una vez por cada casilla pasando por toda la array que este desordenado
				if(numeros[pos2]>numeros[pos2+1]) {//Compara el numero actual con el siguiente y si es mayor lo intercambia
					aux=numeros[pos2];
					numeros[pos2]=numeros[pos2+1];
					numeros[pos2+1]=aux;
					orden = false;
				}
			}
			if(orden==true) { //se puede poner tambien if(orden)
				break; //Rompe el bucle mas cercano
			}
		}
		
		System.out.println();
		
		for(int pos=0; pos<TAM; pos++) {
			System.out.print(numeros[pos] + " ");
		}
	}

}
