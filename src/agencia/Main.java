package agencia;

import Menus.Menu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc = 0;
		
		String vArmas[]= new String[40];
		IODatos.rellenarArmas(vArmas);
		
		do {
			opc = Menu.menuPrincipal();
			switch (opc) {
			case 1: 
				Agentes.mostrarInfoAgentes();
				break;
			case 2:
				Agentes.mostrarAgentesParametro();
				break;
			case 3:
				IODatos.anadirPiso();
				break;
			case 4:
				IODatos.anadirArma();
				break;
			case 5:
				Agentes.anadirAgente();
				break;
			case 6:
				IODatos.encriptarInfo();
				break;
			case 7:
				IODatos.desencriptarInfo();
				break;
			case 8:
				System.out.println("Esperamos volver a verle pronto");
				break;
			}
		} while (opc != 8);

	}

}
