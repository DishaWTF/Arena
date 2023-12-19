package menu_consola;

import java.io.Console;
import java.util.Scanner;

public class Precargar {
	
	//RECURSOS 
	Console consol;
	Scanner sc;
	int Eleccion;
	char Res;
	String Stats;
			
	public Precargar() {
		sc = new Scanner(System.in);//llamar al scanner o lector
		Eleccion = 0;
		Res = ' ';
		Stats = "";
}
}