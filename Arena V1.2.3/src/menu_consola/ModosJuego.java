package menu_consola;

import java.util.Scanner;

public class ModosJuego {
	
	
	//RECURSOS 
	Scanner sc = new Scanner(System.in);
	int Eleccion;
	String linea = new String(new char[65]).replace('\0', '_');

	public ModosJuego() throws InterruptedException {
		
		System.out.println("                                   ;                              ");
		System.out.println("                            :      ED.              :             ");
		System.out.println("                           t#,     E#Wi            t#,           .");
		System.out.println("                          ;##W.    E###G.         ;##W.         ;W");
		System.out.println("            ..       :   :#L:WE    E#fD#W;       :#L:WE        f#E");
		System.out.println("           ,W,     .Et  .KG  ,#D   E#t t##L     .KG  ,#D     .E#f ");
		System.out.println("          t##,    ,W#t  EE    ;#f  E#t  .E#K,   EE    ;#f   iWW;  ");	
		System.out.println("         L###,   j###t f#.     t#i E#t    j##f f#.     t#i L##Lffi");
		System.out.println("       .E#j##,  G#fE#t :#G     GK  E#t    :E#K::#G     GK tLLG##L ");
		System.out.println("      ;WW; ##,:K#i E#t  ;#L   LW.  E#t   t##L   ;#L   LW.   ,W#i  ");
		System.out.println("     j#E.  ##f#W,  E#t   t#f f#:   E#t .D#W;     t#f f#:   j#E.   ");
		System.out.println("   .D#L    ###K:   E#t    f#D#;    E#tiW#G.       f#D#;  .D#j     ");
		System.out.println("  :K#t     ##D.    E#t     G#t     E#K##i          G#t  ,WK,      ");
		System.out.println("  ...      #G      ..       t      E##D.            t   EG.       ");
		System.out.println("           j                       E#t                  ,         ");
		System.out.println("                                   L:                             ");
		System.out.println(linea);
		System.out.println("Elige un modo de juego");
		System.out.println("1. Modo Versus");
		System.out.println("2. Proximamente...");
		System.out.print("Seleccion: ");
		Eleccion = sc.nextInt();
		
		switch(Eleccion) {
		case 1:
			System.out.println("INICIANDO EL MODO VERSUS");
			CargarMenuEleccionPersonaje cargarmenupersonaje = new CargarMenuEleccionPersonaje();
			break;
		
		case 2:
			System.out.println("Este modo no esta disponible actualmente... \n Estamos trabajando arduamente"
			+ "en el. \n equipo DishaLABS");
			System.out.println(linea);
			break;
			
		default:
			System.out.println("Selecciona una opcion valida ( 1 - 2 )");
			ModosJuego modosjuego = new ModosJuego();
		}
		System.out.print("Seleccion: ");
		
		
	
	}
}
