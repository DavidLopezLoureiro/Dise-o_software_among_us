
public class Aerolinea {
	private String codigo_de_aerolinea;
	private String nombre_de_aerolinea;
	
	
	public Aerolinea(String codigo_de_aerolinea, String nombre_de_aerolinea) {
		super();
		this.codigo_de_aerolinea = codigo_de_aerolinea;
		this.nombre_de_aerolinea = nombre_de_aerolinea;
	}


	public String getCodigo_de_aerolinea() {
		return codigo_de_aerolinea;
	}


	public void setCodigo_de_aerolinea(String codigo_de_aerolinea) {
		this.codigo_de_aerolinea = codigo_de_aerolinea;
	}


	public String getNombre_de_aerolinea() {
		return nombre_de_aerolinea;
	}


	public void setNombre_de_aerolinea(String nombre_de_aerolinea) {
		this.nombre_de_aerolinea = nombre_de_aerolinea;
	}
	
	
}
