package agencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IODatos {


public static void rellenarArmas(String[] vArmas) {
	
	File f = new File("Armas.txt");
	FileReader fr =null;
	Scanner leer = null;
	int nArmas = 0;
	if (!f.exists()) {
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} try {
		fr = new FileReader(f);
		leer = new Scanner(fr);
		
		while(leer.hasNext()) {
			String info = leer.nextLine();
			
			vArmas[nArmas]=info;
			nArmas += 1;
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		leer.close();
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public static void anadirArma(String[] vArma) {
	
	//Correccion: Introducir el arma en el fichero y ya
	
	Scanner leer = new Scanner(System.in); // para guardar String
	
	String arma;
	
	System.out.println("Escriba el nombre del arma que desea dar de alta");
	arma = leer.next();
	
	for(int i = 0; i <= 10; i++) {
		if (vArma == null) {
			
			vArma[i] = arma;
			break;
		}
	}
	
}

public static void anadirPiso(Pisos[] vPiso) {
	
	Scanner leer = new Scanner(System.in); // para guardar String
	Scanner ver = new Scanner(System.in); // Para guardar int
	
	String ubicacion;
	String calle;
	int numeroC;
	
	System.out.println("Escriba el nombre de la ubicacion del piso");
	ubicacion = leer.next();
	System.out.println("Escriba el nombre de la calle");
	calle = leer.next();
	System.out.println("Escriba el nombre de la ubicacion del piso");
	numeroC = ver.nextInt();
	
	for(int i = 0; i <= 10; i++) {
		if (vPiso == null) {
			
			vPiso[i] = new vPiso(ubicacion,calle,numeroC);
			break;
		}
	}
}

public static void mostrarInfoAgentes(Agentes[] vAgentes) {
	for (Agentes agente : vAgentes) {
		if (agente!= null)
			System.out.println(agente);
	}	
}



}
