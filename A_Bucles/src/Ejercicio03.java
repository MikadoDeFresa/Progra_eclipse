//muestre los números del 100 al 1 (20 números por línea)
public class Ejercicio03 {

	public static void main(String[] args) {
		int num=100;

		while(num>=1) {

			if(num==21 || num==41 || num==61 || num==81) {
				System.out.println(num + " ");
			}else {
				System.out.print(num + " ");
			}
			num--;
			
			/* Opcion 2
			 * int cont=0;
			 * cont++;
			 * if(cont==20){
			 * 		System.out.println(num + " ");
			 * cont=0;
			 *	else {
			 * 		System.out.print(num + " ");
			 * }
			 * num--;
			 * 
			 * Opcion 3
			 * int mul = 20;
			 * if((num%mul==1(resto)){
			 * 		System.out.println(num + " ");
			 * }else {
			 * 		System.out.print(num + " ");
			 * }
			 * num--;
			 */
		}
	}

}
