import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner scTecl, scFich;
		String strLinea, strFich;
		
		scTecl = new Scanner(System.in);
		
		System.out.print("Introduzca el nombre del fichero: ");
		strFich = scTecl.next();
		
		try {
			scFich = new Scanner(new File(strFich));
			while(scFich.hasNext()) {
				strLinea=scFich.nextLine();
				System.out.println(strLinea);
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("No se puede encontrar el fichero");
		}
		scTecl.close();
	}

}
