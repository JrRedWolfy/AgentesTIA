package clases;

public class Agentes {

	
	protected String nombre;
	
	protected int edad;
	
	protected String direc;
	
	protected float salario;

	public Agentes(String nombre, int edad, String direc, float salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.direc = direc;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	public String getDirec() {
		return direc;
	}
	public void setDirec(String direc) {
		this.direc = direc;
	}

	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Agentes [nombre=" + nombre + ", edad=" + edad + ", direc=" + direc + ", salario=" + salario + "]";
	}

	
	
	
	
	
	
	
	
	
}
