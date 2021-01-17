package EasyBooking;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Aeropuerto {
	private String nombre;
	private String codigo;
	
	public Aeropuerto() {
		super();

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
