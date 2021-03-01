package clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IODatos {


public static void cargarDatosTexto(String[] vArmas) {
	
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
			
			int longitud = info.length();
			
			Ventas.c(nArmas, info);	
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
	





}
