package EasyBooking;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Pago {
	private int fecha;
	private Metodo_De_Pago metodoDePago;

	public Metodo_De_Pago getMetodoDePago() {
		return metodoDePago;
	}

	public void setMetodoDePago(Metodo_De_Pago metodoDePago) {
		this.metodoDePago = metodoDePago;
	}

	public Pago() {
		super();
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
