package menu_consola;

public class PantallaBienvenida {
	public PantallaBienvenida() /*throws InterruptedException*/{
		String linea = new String(new char[65]).replace('\0', '_');
		System.out.println(linea);
		System.out.println("                                  ,;L.                            \r\n"
						 + "                j.               f#i EW:        ,ft               \r\n"
						 + "             .. EW,            .E#t  E##;       t#E            .. \r\n"
						 + "            ;W, E##j          i#W,   E###t      t#E           ;W, \r\n"
						 + "           j##, E###D.       L#D.    E#fE#f     t#E          j##, \r\n"
						 + "          G###, E#jG#W;    :K#Wfff;  E#t D#G    t#E         G###, \r\n"
						 + "        :E####, E#t t##f   i##WLLLLt E#t  f#E.  t#E       :E####, \r\n"
						 + "       ;W#DG##, E#t  :K#E:  .E#L     E#t   t#K: t#E      ;W#DG##, \r\n"
						 + "      j###DW##, E#KDDDD###i   f#E:   E#t    ;#W,t#E     j###DW##, \r\n"
						 + "     G##i,,G##, E#f,t#Wi,,,    ,WW;  E#t     :K#D#E    G##i,,G##, \r\n"
						 + "   :K#K:   L##, E#t  ;#W:       .D#; E#t      .E##E  :K#K:   L##, \r\n"
						 + "  ;##D.    L##, DWi   ,KK:        tt ..         G#E ;##D.    L##, \r\n"
						 + "  ,,,      .,,                                   fE ,,,      .,,  \r\n"
						 + "                 Mateo Padilla - DishaWTF labs        ,      v0.1      "	);
		System.out.println(linea);
		//System.out.print("Every\tword\tin\tthis\tsentence\tis\tseparated\tby\ta\ttab.");
		//System.out.print("\033[H\033[2J"); // escribe sobre la linea anterior 
		//System.out.print("\033[34m]"); // cambia color azul 
		
		System.out.flush();
		//System.out.print("\033[%dm %3d\033[m");
		
	}
	
}
