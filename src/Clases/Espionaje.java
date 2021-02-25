package Clases;

import java.util.Arrays;

public final class Espionaje extends Agentes {

	private Pisos[] vPiso;

	

	
	public Espionaje(String nombre, int edad, String direc, float salario) {
		super(nombre, edad, direc, salario);
		this.vPiso = IODatos.cargarDatosTexto("Pisos.txt");
	}
	
	public Pisos[] getvPiso() {
		return vPiso;
	}
	public void setvPiso(Pisos[] vPiso) {
		this.vPiso = vPiso;
	}


	@Override
	public String toString() {
		return "Espionaje [vPiso=" + Arrays.toString(vPiso) + "]";
	}
	
	
	
	
	
	
}
