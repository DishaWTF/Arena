package menu_consola;
import java.io.Console;


public class TiempoEspera {
	public TiempoEspera(long segundos) throws InterruptedException {
	     Thread.sleep(segundos*1000); // realiza un tiempo de espera de X milisegundos
	}
		
}
