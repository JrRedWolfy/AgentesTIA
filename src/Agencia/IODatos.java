package Agencia;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import clases.CeroCeroSiete;



public class IODatos {

	
		public static String[] cargarDatosArmas(String rutaFichero) {
			File f = new File(rutaFichero);
			String[] vArmas = new String[50];
			
			int cont=0;
			if (!f.exists()) {
				try {
					f.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try (FileReader fr = new FileReader(f); Scanner leer = new Scanner(fr);){
					
					while(leer.hasNext()) {
						String v = leer.nextLine();
						vArmas[cont] = v;
						cont++;
					}
					
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
			return vArmas;
			
		}

	}


