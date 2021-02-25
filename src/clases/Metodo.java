package clases;

import java.util.Scanner;

public class Metodo {

	// Crear un metodo que cree una nueva arma
	//Crear un metodo que cree un nuevo piso
	//Nuevo arma, añadir al vector String vArma, escribirlo en el documento, (String)
	//Nuevo Piso, añadir al vector Pisos vPiso, escribirlo en el documento, (String)(String)(int)
	
	//Estos metodos probablemente se situen en IODatos.class
	
	
	
	
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
	
	
}
