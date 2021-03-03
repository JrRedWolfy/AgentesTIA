package agencia;

import java.util.ArrayList;

import Menus.Menu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc = 0;
		
		ArrayList<Agentes> vAgentes = new ArrayList();
		
		
		do {
			opc = Menu.menuPrincipal();
			switch (opc) {
			case 1: 
				IODatos.mostrarInfoAgentes(vAgentes);
				break;
			case 2:
				IODatos.mostrarAgentesParametro(vAgentes);
				break;
			case 3:
				IODatos.anadirPiso(listaPisos);
				break;
			case 4:
				IODatos.anadirArma();
				break;
			case 5:
				Agentes.anadirAgente(vAgentes);
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
