package agencia;

import Menus.Menu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc = 0;
		
		String listaArmas[]= new String[40];
		IODatos.rellenarArmas(listaArmas);
		
		Pisos listaPisos[]= new Pisos[20];
		IODatos.rellenarPisos(listaPisos);
		
		Agentes vAgentes[] = new Agentes[10];
		
		
		
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
				IODatos.anadirArma(listaArmas);
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
