package Agencia;

import Menus.Menu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc = 0;
		do {
			opc = Menu.menuPrincipal();
			switch (opc) {
			case 1: {
					agencia.IODatos.mostrarInfoAgentes(null);
			}break;
			case 2:{
				
			}break;
			case 3: {
					agencia.IODatos.anadirPiso(null);
			}break;
			case 4:{
					agencia.IODatos.anadirArma(args);
			}break;
			case 5:{
				
			}break;
			case 6:{
				
			}break;
			case 7:{
				
			}break;
			case 8:{
				
			}break;
			

			}
		} while (opc != 8);

	}

}
