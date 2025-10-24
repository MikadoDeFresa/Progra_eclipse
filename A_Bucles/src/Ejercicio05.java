//muestre los números del 1 al 100 (20 números por línea)
public class Ejercicio05 {

	public static void main(String[] args) {
		int num;
		
		for(num=1; num<=100; num++) {
			if(num==20 || num==40 || num==60 || num==80) {
				System.out.println(num + " ");
			}else {
				System.out.print(num + " ");
			}
		}
	}
}
