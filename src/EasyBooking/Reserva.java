package EasyBooking;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Reserva {
	
	private Usuario usuario;
	private int numeroDeAsientos;
	private String nombreDeLosPasajeros[];
	private float precio;
	private int fecha;
	private Vuelo vuelo;
	private Pago pago;
	
	
	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public Reserva() {
		super();
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public int getnumeroDeAsientos() {
		return numeroDeAsientos;
	}


	public void setnumeroDeAsientos(int numeroDeAsientos) {
		this.numeroDeAsientos = numeroDeAsientos;
	}


	public String[] getnombreDeLosPasajeros() {
		return nombreDeLosPasajeros;
	}


	public void setnombreDeLosPasajeros(String[] nombreDeLosPasajeros) {
		this.nombreDeLosPasajeros = nombreDeLosPasajeros;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public int getFecha() {
		return fecha;
	}


	public void setFecha(int fecha) {
		this.fecha = fecha;
	}


	public Vuelo getVuelo() {
		return vuelo;
	}


	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	
	
	
}
