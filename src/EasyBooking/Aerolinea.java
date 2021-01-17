package EasyBooking;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Aerolinea {
	private String codigoDeAerolinea;
	private String nombreDeAerolinea;
	
	public Aerolinea() {
		super();
	}

	public String getcodigoDeAerolinea() {
		return codigoDeAerolinea;
	}


	public void setcodigoDeAerolinea(String codigoDeAerolinea) {
		this.codigoDeAerolinea = codigoDeAerolinea;
	}


	public String getnombreDeAerolinea() {
		return nombreDeAerolinea;
	}


	public void setnombreDeAerolinea(String nombreDeAerolinea) {
		this.nombreDeAerolinea = nombreDeAerolinea;
	}
	
	
}
