//pedir por teclado los nombres de los ficheros origen y destino
//realizar una copia del fichero origen en el destino
//Si el fichero no existe -> no se puede hacer nada (acaba el programa)
//Si el fichero destino existe -> aviso y preguntar que hacer

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner scTecl, scFich;
		String resp, strFich1, strFich2, linea;
		File fDestino;
		PrintWriter pw;
		
		scTecl = new Scanner(System.in);
		
		System.out.print("Introduzca el nombre del fichero origen: ");
		strFich1 = scTecl.next();
		
		try {
			scFich = new Scanner(new File(strFich1));
			System.out.print("Introduzca el nombre del fichero destino: ");
			strFich2 = scTecl.next();
			fDestino = new File(strFich2);
			
			//File.exists()
			if(fDestino.exists()) {
				System.out.print("El destino existe. ¿Quieres sobreescribir? (S/N): ");
				resp=scTecl.next();
				if(resp.equalsIgnoreCase("S")) {
					pw= new PrintWriter(fDestino);
					while(scFich.hasNext()) {
						linea=scFich.nextLine();
						pw.println(linea);
					}
				pw.close();
				
				}else {
					System.exit(0);
				}
			}else {
				pw= new PrintWriter(fDestino);
				while(scFich.hasNext()) {
					linea=scFich.nextLine();
					pw.println(linea);
				}
				pw.close();
			}
			System.out.println("Archivo copiado con exito.");
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("No se puede encontrar el fichero");
			System.exit(0);
		}
	}
}
