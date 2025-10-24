//Llenar una array con 20 elementos con numeros enteros aleatorios entre 1 y 50
public class Ejercicio05 {
	
	public static final int TAM = 20;
	public static void main(String[] args) {
		
		int num, max=50, min=1, mayor, ult, interpos=0;
		int numeros[];
		
		numeros=new int [TAM];
		mayor=numeros[0]; //Igualar al numero de la posición 0
		
		for(int pos=0; pos<TAM; pos++) {
			num= (int)(Math.random() * (max + min));
			numeros[pos]=num;
			System.out.print(numeros[pos] + " ");
			if(numeros[pos]>mayor) {
				mayor=numeros[pos];
				interpos=pos;
			}
		}
		numeros[interpos]=numeros[TAM-1];
		numeros[TAM-1]=mayor;
		/*ult=numeros[TAM-1];
		numeros[TAM-1]=mayor;
		numeros[interpos]=ult;*/
		
		System.out.println();
		System.out.print("El número mayor es: " + mayor);
		System.out.println();
		
		for(int pos=0; pos<TAM; pos++) {
			System.out.print(numeros[pos] + " ");
		}
	}
}