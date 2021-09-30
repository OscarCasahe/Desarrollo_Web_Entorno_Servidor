package Default;



public class Presidente {

	private String nombre;
	private String apellidos;
	private int anioEleccion;
	private static Presidente presidente = null ;
	
	
	private Presidente(String nombre, String apellidos, int añoEleccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.anioEleccion = añoEleccion;
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


	public int getAñoEleccion() {
		return anioEleccion;
	}


	public void setAñoEleccion(int añoEleccion) {
		this.anioEleccion = añoEleccion;
	}


	@Override
	public String toString() {
		return "Presidente [nombre=" + nombre + ", apellidos=" + apellidos + ", añoEleccion=" + anioEleccion + "]";
	}
	
	
	
	
}
