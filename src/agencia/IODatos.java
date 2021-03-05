package agencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class IODatos {

public static void anadirArma() {
	
	Scanner leer = new Scanner(System.in);
	
	System.out.println("Escriba el nombre del arma que desea dar de alta");
	String arma = leer.next();
	
	
	
	File f = new File("Armas.txt");
	
	
	if (!f.exists()) {
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} try (FileWriter fw = new FileWriter(f,true);
			PrintWriter escribir = new PrintWriter(fw)){
		
			escribir.println(arma);
			
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
}

public static void anadirPiso(ArrayList<agencia.Pisos> Pisos) {
	ArrayList<agencia.Pisos> vPiso = new ArrayList();
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
			
			vPiso[i] = new Pisos(ubicacion,calle,numeroC);
			break;
		}
	}
}


public static void mostrarInfoAgentes(ArrayList<Agentes> vAgentes) {
	for (Agentes agente : vAgentes) {
		
			System.out.println(agente);
	}
}

public static void mostrarAgentesParametro(ArrayList<Agentes> vAgentes) {
	
	Scanner leer = new Scanner(System.in);
	
	int cantidad = 0;
	System.out.println("Introduce una cantidad y le devolveremos aquellos agentes que ganen mas");
	cantidad = leer.nextInt();
	
	for (Agentes agente : vAgentes) {
		if (agente.getSalario()>cantidad)
			System.out.println(agente);
	}	
}

public static void rellenarPisos(Pisos[] vPisos) {
	File f = new File("Pisos.txt");
	FileReader fr =null;
	Scanner leer = null;
	int nPisos = 0;
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
			
			vPisos[nPisos] = new Pisos("","",0);
			nPisos += 1;
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

public static void anadirAgente(ArrayList<Agentes> vAgentes) {
	
	
	
	
}



public static ArrayList<String> cargarArmas() {
	ArrayList<String> vArmas = new ArrayList();
	File f = new File("Armas.txt");
	FileReader fr =null;
	Scanner leer = null;
	
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
			
			vArmas.add(info);
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
	return vArmas;
}




}
