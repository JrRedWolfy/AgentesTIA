package Menus;

import java.util.Scanner;

public class Menu {


	public static int menuPrincipal() {
		Scanner leer = new Scanner(System.in);
		int opc=0;
		
		
		System.out.println("                 ____     ____ _______  ___    __  __     __");
		System.out.println("<<<<<<<<<<<<<<<< ||\\     //||  ||/////  ||\\    ||  ||     || >>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<< || \\   // ||  ||       || \\   ||  ||     || >>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<< ||  \\//  ||  ||/////  ||  \\  ||  ||     || >>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<< ||        ||  ||       ||   \\ ||  ||     || >>>>>>>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<<<<<< ||        ||  ||/////  ||    \\||  ||_____|| >>>>>>>>>>>>>>>>");
		System.out.println("                 ¯¯        ¯¯  ¯¯¯¯¯¯¯  ¯¯      ¯¯  ¯¯¯¯¯¯¯¯¯");
		
		System.out.println("---> Introduce 1 para ver todos los agentes con su información");
		System.out.println("---> Introduce 2 para ver los agentes que ganen más de una cantidad X");
		System.out.println("---> Introduce 3 para dar de alta un nuevo piso");
		System.out.println("---> Introduce 4 para dar de alta un nuevo arma");
		System.out.println("---> Introduce 5 para dar de alta un nuevo agente");
		System.out.println("---> Introduce 6 para encriptar TODA la indormación guardada");
		System.out.println("---> Introduce 7 para desencriptar la información guardada");
		System.out.println("---> Introduce 8 para SALIR");
		
		
		opc = leer.nextInt();
		if(opc <= 0 || opc > 8) {
			try {
				System.out.println("Debes introducir un numero entre 1 y 8");
			} catch (Exception e) {
				
			}
		}
		
		return opc;
	}
}
