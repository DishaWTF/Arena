package menu_consola;
import personajes.Barbaro;
import personajes.Hechicero;
import java.util.Scanner;

public class CargarMenuEleccionPersonaje {
	
	//Recursos de esta clase
	Scanner sc = new Scanner(System.in);
	public int Eleccion;
	public char Res;
	
	
	public CargarMenuEleccionPersonaje() throws InterruptedException {
		//String linea = new String(new char[65]).replace('\0', '█');
		String linea = new String(new char[65]).replace('\0', '�');
		System.out.println(linea);
		System.out.println(" Bienvenido a la Arena de Combate ");
		System.out.println("¿Que personaje Deseas Elegir para ir a batalla?");
		System.out.println(linea);
		
		System.out.println("Mago = 1");
		System.out.println("Barbaro = 2");
		
				
		System.out.print("Seleccion: ");
		Eleccion = sc.nextInt();
		
		cargarPersonaje(Eleccion);

	}	
	public void cargarPersonaje(int eleccion) throws InterruptedException {

		System.out.flush();

		switch (Eleccion) { 
		// EN CASO DE ESCOGER AL MAGO
		case 1:
			//Crea al mago - Datos predefinidos de mago
			Hechicero Witch = new Hechicero(); 

			System.out.println("Haz elegido al Mago. "
					+ "\n¿quieres ver sus estadisticas primero?"
					+ "\nPresiona S para confirmar o N para denegar");

	
			System.out.print("Seleccion: ");
			Res = sc.next().charAt(0); // convierte la respuesta a una lista de letras y selecciona sólo la primera.

			if(Res == 'S' || Res == 's' ) {
				
				MostrarDatosPersonaje mostrar = new MostrarDatosPersonaje(Witch);
				
				mensaje_confirmacion mensaje = new mensaje_confirmacion();
				
				if(mensaje.confirmacion) {
					System.out.println("Has confirmado el personaje mago.");
					System.out.println("Cargando pantalla siguiente.");
				}else {
					System.out.println("Cargando menú de nuevo.");
					MenuPrincipal menuprincipal = new MenuPrincipal();
				}
			}
			
			break;
			//EN CASO DE ESCOGER AL BARBARO
		case 2:
			Barbaro barbaro = new Barbaro(); 	

			System.out.println("Haz elegido al Barbaro. "
					+ "\n¿quieres ver sus estadisticas?"
					+ "\nPresiona S para confirmar o N para denegar");

			System.out.print("Seleccion: ");
			Res = sc.next().charAt(0); // convierte la respuesta a una lista de letras y selecciona sólo la primera.

			if(Res == 'S' || Res == 's' ) {
				MostrarDatosPersonaje mostrar = new MostrarDatosPersonaje(barbaro);
				mensaje_confirmacion mensaje = new mensaje_confirmacion();
			
			if(mensaje.confirmacion) {
				System.out.println("Has confirmado el personaje mago.");
				System.out.println("Cargando pantalla siguiente.");
			}else {
				System.out.println("Cargando menú de nuevo.");
				MenuPrincipal menuprincipal = new MenuPrincipal();
			}
			break;
		 }
		default:

			break;

		}

	}
	

}
