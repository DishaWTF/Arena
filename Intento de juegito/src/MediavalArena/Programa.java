/**
 * @author Julian A. Peña
 *	Esta clase se encarga de iniciar la aplicación
 */

package MediavalArena;

import menu_consola.MenuPrincipal;
import menu_consola.TiempoEjecucion;

public class Programa {

	public static void main(String[] args) throws InterruptedException {
		
		
		// EJECUTA MODO CONSOLA
		
		TiempoEjecucion tiempoEjecucion = new TiempoEjecucion();
		tiempoEjecucion.Iniciar();
		
		MenuPrincipal app = new MenuPrincipal();
		
		tiempoEjecucion.Terminar();
		
		// EJECUTA MODO ESCRITORIO
		// ...
		// ...
		// ..
		
		// EJECUTA MODO WEB
		// ...
		// ...
		// ..
	}
	
}

/**
 * @Recursos 
 *  img referencia: 		http://4.bp.blogspot.com/-vg3wfphVncQ/UshRjkyxOVI/AAAAAAAAC18/aLeBaHxZGu0/s1600/RPG+Maker+VX+Ace+Crystal+Engine+%25E2%2580%2593+Extra+Stats.png
 *  ASCII Text Generator: 	http://patorjk.com/software/taag/#p=display&f=Def%20Leppard&t=ARENA
 */