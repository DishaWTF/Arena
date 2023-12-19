package menu_consola;
import java.io.Console;
import java.util.Scanner;

import personajes.Barbaro;
import personajes.Hechicero;
import personajes.IPersonaje;

public class MenuPrincipal {
	
	//RECURSOS DEL MenuPrincipal
		Console consol;
		Scanner sc;
		int Eleccion;
		char Res;
		String Stats;
		String linea = new String(new char[65]).replace('\0', '_');
		TiempoEspera tiempoEspera;
		
		
 public MenuPrincipal() throws InterruptedException {
	//PREGARGAR VARIABLES - RECURSOS
	Precargar precargar  = new Precargar();
	tiempoEspera = new TiempoEspera(1);
			
	//PANTALLA DE BIENVENIDA (MENU INICIAL)
	PantallaBienvenida pantallaBienvenida = new PantallaBienvenida();
	tiempoEspera = new TiempoEspera(2);
	LimpiarConsola.LimpiarConSaltosLinea();
	tiempoEspera = new TiempoEspera(1);
	
	//SELECCION DE MODOS DE JUEGO - CargarMenuEleccionPersonajes
	ModosJuego modosjuego = new ModosJuego();
	LimpiarConsola.LimpiarConSaltosLinea();
	     
 }
		
	
	

}
