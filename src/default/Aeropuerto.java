import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Aeropuerto {
	private String nombre;
	private String codigo;
	
	
	public Aeropuerto(String nombre, String codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	
}
