package gywerno;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Gyverno {

	public static void rellenarArmas(ArrayList<String> vArmas) {
		
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
		
	}

	
	
	
	
	
	
	
	
	
}
