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
				System.out.println(IODatos.cargarDatosArmas("Armas.txt"));
			}
			case 3: {
				
			}

			}
		} while (opc != 8);

	}

}
