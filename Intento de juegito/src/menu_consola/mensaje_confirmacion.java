package menu_consola;
import java.util.Scanner;

public class mensaje_confirmacion {
	
	public boolean confirmacion;
	
	public mensaje_confirmacion() {
		// operaciones y mensajes de confirmacion
		System.out.println("¿Está seguro de su elección?");
		System.out.println("1. Si");
		System.out.println("2. No");
		System.out.print("Seleccione un numero (1-2): ");
		Scanner sc =  new Scanner(System.in);
		int eleccion = sc.nextInt();
		if(eleccion == 1) {
			confirmacion = true;
		}else {
			confirmacion =  false;
		}
	}		
}
