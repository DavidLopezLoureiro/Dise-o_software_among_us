import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Pago {
	private int fecha;

	public Pago(int fecha) {
		super();
		this.fecha = fecha;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
