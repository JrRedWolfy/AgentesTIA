package agencia;

import java.util.ArrayList;
import java.util.Arrays;


public final class CeroCeroSiete extends Agentes {

	
	private ArrayList<String> vArmas = new ArrayList();
	
	private int nMuertes;

	
	public CeroCeroSiete(String nombre, int edad, String direc, float salario, int nMuertes) {
		super(nombre, edad, direc, salario);
		
		this.vArmas = vArmas;
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
		String armas = "";
		for (String p : vArmas) {
			if (p!=null)
				armas  += p + "\n";
		}
		
		return super.toString() + "CeroCeroSiete [vArmas=" + armas + ", nMuertes=" + nMuertes + "]";
	}
	
	
	
	
	
	
}
