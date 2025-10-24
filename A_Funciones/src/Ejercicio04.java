//Funcion para llenar un array recibido de 20 como parametro con numeros enteros aleatorios de dos digitos
// Funcion para mostrar por pantalla un array recibido como parametro
//Funcion que ordene de forma ascendente el array
//llenar y mostrar dos arrays
public class Ejercicio04 {
	public static final int TAM = 20;
	public static void main(String[] args) {
		int nums1[], nums2[], nums3[];
		
		nums1=new int [TAM];
		nums2=new int [TAM];
		nums3=new int [40];
		
		llenar(nums1);
		mostrar(nums1);
		
		llenar(nums2);
		mostrar(nums2);
		
		System.out.println("Ordenado:");
		ordenar(nums1);
		mostrar(nums1);
		
		ordenar(nums2);
		mostrar(nums2);
		
		juntar(nums1, nums2, nums3);
		mostrar(nums3);
	}
	
	public static int[] llenar(int n[]) {
		int num, max=99, min=10;
		for(int pos=0; pos<n.length; pos++) {
			num= (int)(Math.random() * (max - min) + min);
			n[pos]=num;
		}
		return n;
	}
	//Funcion para juntar los dos arrays y ordenarlos
	public static void juntar(int n1[], int n2[], int total[]) {
		int cont1=0, cont2=0;
		
		// Mezclar mientras ambos arrays tengan elementos
		do {
			if(n1[cont1]<n2[cont2]) {
				total[cont1+cont2]=n1[cont1];
				cont1++;
			} else {
				total[cont1+cont2]=n2[cont2];
				cont2++;
			}
		}while(cont1<n1.length && cont2<n2.length);
		
		// Copiar elementos restantes de n1 (si los hay)
		while(cont1 < n1.length) {
	        total[cont1 + cont2] = n1[cont1];
	        cont1++;
	    }
	    
	    // Copiar elementos restantes de n2 (si los hay)
	    while(cont2 < n2.length) {
	        total[cont1 + cont2] = n2[cont2];
	        cont2++;
	    }
	}
	
	public static int[] mostrar(int n[]) {
	        for (int i = 0; i < n.length; i++) {
	            System.out.print(n[i] + " ");
	        }
	        System.out.println();
			return n;
	}
	
	public static void ordenar (int n[]) {
		boolean orden;
		int aux;
		for(int pos=0; pos<n.length; pos++) { //Se repite tantas veces como el tamaño del array
			orden = true;
			for(int pos2=0; pos2<n.length-pos-1; pos2++) { //Se repite una vez por cada casilla pasando por toda la array que este desordenado
				if(n[pos2]>n[pos2+1]) {//Compara el numero actual con el siguiente y si es mayor lo intercambia
					aux=n[pos2];
					n[pos2]=n[pos2+1];
					n[pos2+1]=aux;
					orden = false;
				}
			}
			if(orden==true) { //se puede poner tambien if(orden)
				break; //Rompe el bucle mas cercano
			}
		}
	}
}
