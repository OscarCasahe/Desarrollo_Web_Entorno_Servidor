package Default;



public class Presidente {

	private String nombre;
	private String apellidos;
	private int anioEleccion;
	private static Presidente presidente = null ;
	
	
	private Presidente(String nombre, String apellidos, int a�oEleccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anioEleccion = a�oEleccion;
	}

	
	public static Presidente getPresidente(String nombre, String apellidos, int anioEleccion) {
		if (presidente == null) {
					
			presidente = new Presidente(nombre, apellidos, anioEleccion);
		}
		return presidente;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getA�oEleccion() {
		return anioEleccion;
	}


	public void setA�oEleccion(int a�oEleccion) {
		this.anioEleccion = a�oEleccion;
	}


	@Override
	public String toString() {
		return "Presidente [nombre=" + nombre + ", apellidos=" + apellidos + ", a�oEleccion=" + anioEleccion + "]";
	}
	
	
	
	
}
