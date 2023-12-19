package menu_consola;

public class TiempoEjecucion {
	
	long inicio;
	
	public TiempoEjecucion(){
		
	}
	
	public void Iniciar() {
		this.inicio = System.currentTimeMillis(); // tiempo inicial en milisegundos
	}
	
	public void Terminar() {
		System.out.println("Ejecución finalizada en milisegundos = " + (System.currentTimeMillis() - this.inicio));
	}

}
