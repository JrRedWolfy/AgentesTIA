package Clases;

import java.util.Arrays;

public final class CeroCeroSiete extends Agentes {

	
	private String[] vArmas;
	
	private int nMuertes;

	
	public CeroCeroSiete(String nombre, int edad, String direc, float salario, String[] vArmas, int nMuertes) {
		super(nombre, edad, direc, salario);
		this.vArmas = IODatos.cargarDatosArmas("Armas.txt");
		this.nMuertes = nMuertes;
	}
	
	
	public String[] getvArmas() {
		return vArmas;
	}
	public void setvArmas(String[] vArmas) {
		this.vArmas = vArmas;
	}

	
	public int getnMuertes() {
		return nMuertes;
	}
	public void setnMuertes(int nMuertes) {
		this.nMuertes = nMuertes;
	}


	@Override
	public String toString() {
		return "CeroCeroSiete [vArmas=" + Arrays.toString(vArmas) + ", nMuertes=" + nMuertes + "]";
	}
	
	
	
	
	
	
}
