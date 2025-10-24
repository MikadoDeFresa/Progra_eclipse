// Crea un array para gestionar un tablero de ajedrez
// Llenar con las piezas en su posicion inicial
// Mostrar por pantalla

import java.util.Scanner;

public class Ejercicio08 {

	public static final int TAM=8;
	public static void main(String[] args) {
		char [][]tablero;
		int cont=1, filaOrigen, colOrigen, filaDes, colDes;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		tablero = new char [TAM][TAM];
		
		tablero[0][0]='T';
		tablero[0][1]='C';
		tablero[0][2]='A';
		tablero[0][3]='Q';
		tablero[0][4]='K';
		tablero[0][5]='A';
		tablero[0][6]='C';
		tablero[0][7]='T';
		
		for(int fila=1; fila<TAM-1; fila++) {
			for(int col=0; col<TAM; col++) {
				if(fila==1 || fila==6) {
					tablero[fila][col]= 'P';
				} else
				{
					tablero[fila][col]= '.';
				}
			}
		}
		
		tablero[7][0]='T';
		tablero[7][1]='C';
		tablero[7][2]='A';
		tablero[7][3]='Q';
		tablero[7][4]='K';
		tablero[7][5]='A';
		tablero[7][6]='C';
		tablero[7][7]='T';
		
		System.out.println("BLANCAS");
		System.out.println("  1 2 3 4 5 6 7 8");
		for(int fila=0; fila<TAM; fila++) { //tablero.lenght es el numero de filas (primera array) y tablero[0].length es el numero de columnas
			System.out.print(cont + " ");
			cont++;
			for(int col=0; col<TAM; col++) {
				System.out.print(tablero[fila][col] + " ");
			}
			System.out.println();
		}
		System.out.println("NEGRAS");
		
		cont=8;
		System.out.println("NEGRAS");
		System.out.println("  8 7 6 5 4 3 2 1");
		for(int fila=TAM-1; fila>-1; fila--) {
			System.out.print(cont + " ");
			cont--;
			for(int col=TAM-1; col>-1; col--) {
				System.out.print(tablero[fila][col] + " ");
			}
			System.out.println();
		}
		System.out.println("BLANCAS");
		
		System.out.println("Introduce la fila de la ficha que quieres mover: ");
		filaOrigen=sc.nextInt();
		System.out.println("Introduce la columna de la ficha que quieres mover: ");
		colOrigen=sc.nextInt();
		
		while(filaOrigen<1 || filaOrigen>8 || colOrigen<1 || colOrigen>8 || tablero[filaOrigen-1][colOrigen-1]=='.')//((filaOrigen<1 || filaOrigen>8 || colOrigen<1 || colOrigen>8) && tablero[filaOrigen-1][colOrigen-1]=='.')
		{
			System.out.println("Esa posición no es valida. Introduce la fila de la ficha que quieres mover(1-8): ");
			filaOrigen=sc.nextInt();
			System.out.println("Introduce la columna de la ficha que quieres mover(1-8): ");
			colOrigen=sc.nextInt();
		}
		
		System.out.println("Introduce la fila de la casilla de destino(1-8): ");
		filaDes=sc.nextInt();
		System.out.println("Introduce la columna de la casilla de destino(1-8): ");
		colDes=sc.nextInt();
		
		while(filaDes<1 || filaDes>8 || colDes<1 || colDes>8)
		{
			System.out.println("Esa casilla no existe. Introduce la fila de la casilla de destino(1-8): ");
			filaDes=sc.nextInt();
			System.out.println("Introduce la columna de la casilla de destino(1-8): ");
			colDes=sc.nextInt();
		}
		
		tablero[filaDes-1][colDes-1]=tablero[filaOrigen-1][colOrigen-1];
		tablero[filaOrigen-1][colOrigen-1]='.';
		
		cont=8;
		System.out.println("NEGRAS");
		System.out.println("  8 7 6 5 4 3 2 1");
		for(int fila=TAM-1; fila>-1; fila--) {
			System.out.print(cont + " ");
			cont--;
			for(int col=TAM-1; col>-1; col--) {
				System.out.print(tablero[fila][col] + " ");
			}
			System.out.println();
		}
		System.out.println("BLANCAS");
		
	}
}
