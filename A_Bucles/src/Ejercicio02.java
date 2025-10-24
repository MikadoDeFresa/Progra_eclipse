
//muestre los números del 1 al 100 (20 números por línea)
public class Ejercicio02 {

	public static void main(String[] args) {
		int num=1;

		while(num<=100) {

			if(num==20 || num==40 || num==60 || num==80) {
				System.out.println(num + " ");
			}else {
				System.out.print(num + " ");
			}
			num++;
			
			/* Opcion 2
			 * int cont=0;
			 * cont++;
			 * if(cont==20){
			 * 		System.out.println(num + " ");
			 * cont=0;
			 *	else {
			 * 		System.out.print(num + " ");
			 * }
			 * num++;
			 * 
			 * Opcion 3
			 * int mul = 20;
			 * if(num%mul==0){
			 * 		System.out.println(num + " ");
			 * }else {
			 * 		System.out.print(num + " ");
			 * }
			 * num++;
			 */
		}
	}
}