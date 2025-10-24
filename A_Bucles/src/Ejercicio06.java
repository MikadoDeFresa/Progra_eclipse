//muestre los números del 100 al 1 (20 números por línea)
public class Ejercicio06 {

	public static void main(String[] args) {
		int num;
		
		for(num=100; num>=1; num--) {
			if(num==21 || num==41 || num==61 || num==81) {
				System.out.println(num + " ");
			}else {
				System.out.print(num + " ");
			}
		}
	}

}
