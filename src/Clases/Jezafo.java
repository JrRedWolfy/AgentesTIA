package Clases;

public final class Jezafo extends Agentes {

	private String aniosMandato;


	
	public Jezafo(String nombre, int edad, String direc, float salario, String aniosMandato) {
		super(nombre, edad, direc, salario);
		this.aniosMandato = aniosMandato;
	}
	public String getAniosMandato() {
		return aniosMandato;
	}
	public void setAniosMandato(String aniosMandato) {
		this.aniosMandato = aniosMandato;
	}


	@Override
	public String toString() {
		return "Jezafo [aniosMandato=" + aniosMandato + "]";
	}

	
	
	
	
	
}
