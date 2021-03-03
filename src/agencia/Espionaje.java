package agencia;

import java.util.Arrays;


public final class Espionaje extends Agentes {

	private Pisos[] vPiso;

	

	
	public Espionaje(String nombre, int edad, String direc, float salario) {
		super(nombre, edad, direc, salario);
		this.vPiso = vPiso;
	}
	
	public Pisos[] getvPiso() {
		return vPiso;
	}
	public void setvPiso(Pisos[] vPiso) {
		this.vPiso = vPiso;
	}


	@Override
	public String toString() {
		String pisos = "";
		for (Pisos p : vPiso) {
			if (p!=null)
				pisos  += p + "\n";
		}
		return super.toString() + " Espionaje [Pisos = " + pisos + "]";
	}
	
	
	
	
	
	
}
