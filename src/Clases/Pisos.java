package Clases;

public class Pisos {

	String ubicacion;
	
	String calle;
	
	int numeroC;

	public Pisos(String ubicacion, String calle, int numeroC) {
		this.ubicacion = ubicacion;
		this.calle = calle;
		this.numeroC = numeroC;
	}

	
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}

	
	public int getNumeroC() {
		return numeroC;
	}
	public void setNumeroC(int numeroC) {
		this.numeroC = numeroC;
	}

	@Override
	public String toString() {
		return ubicacion + ", " + calle + " número" + numeroC;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
