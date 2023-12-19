package menu_consola;


import java.io.Console;
import java.io.IOException;  
import java.lang.Object;
import java.lang.runtime.*;


public class LimpiarConsola {
	public static void LimpiarConInjeccionMixta() {
	    try {
	    	final String os = System.getProperty("os.name");
	        if (os.contains("Windows")) {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } else {
	            Runtime.getRuntime().exec("clear");
	        }
	    } catch (final Exception e) {
	        System.out.println("Error al limpiar la pantalla de la consola: " + e.getMessage());
	    }
	}
	
	public static void LimpiarConInjeccionRuntinme() {
	    try {
	    	final String os = System.getProperty("os.name");  
	    	if (os.contains("Windows"))  
	    	{  
	    		Runtime.getRuntime().exec("cls");  
	    	}  
	    	else  
	    	{  
	    		Runtime.getRuntime().exec("clear");  
	    	}   
	    } catch (final Exception e) {
	        System.out.println("Error al limpiar la pantalla de la consola: " + e.getMessage());
	    }
	}
	
	public static void LimpiarConEscapeCaracteres() {
		// Los caracteres de escape son aquellos encargados de dar formato al texto y ejecutar comandos como arriba, abajo, eliminar, enter, etc en consola. 
		//final String ESC = "\033[";
		System.out.print("\033[H\033[J$<50>");
		System.out.flush();
		System.out.print("");
		
		
	}
	
	public static void LimpiarConInjeccionProcessBuilder(){
        try{
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system
              
            if(operatingSystem.contains("Windows")){
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            } 
        }catch(Exception e){
            System.out.println(e);
        }
    }
	
	public static void LimpiarConSaltosLinea() {
		for (int i = 0; i < 25; ++i) System.out.println();
	}
	
	public static void LimpiarConFormato() {
		System.out.printf("\f");
	}
	
	public static void LimpiarConObjetoConsola() {
		Console console = System.console();        
        if (console == null)
                System.out.println("Couldn't get Console object !");
        console.flush();
	}
	public static void LimpiarConEscapeCaracteresTiempoEspera() throws InterruptedException {
		// Los caracteres de escape son aquellos encargados de dar formato al texto y ejecutar comandos como arriba, abajo, eliminar, enter, etc en consola.
		System.out.print("\u000C");
		Thread.sleep(2000);
	}
	
}
