
public class Reserva {
	
	private Usuario usuario;
	private int numero_de_asientos;
	private String nombre_de_los_pasajeros[];
	private float precio;
	private int fecha;
	private Vuelo vuelo;
	
	
	public Reserva(Usuario usuario, int numero_de_asientos, String[] nombre_de_los_pasajeros, float precio, int fecha, Vuelo vuelo) {
		super();
		this.usuario = usuario;
		this.numero_de_asientos = numero_de_asientos;
		this.nombre_de_los_pasajeros = nombre_de_los_pasajeros;
		this.precio = precio;
		this.fecha = fecha;
		this.vuelo = vuelo;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public int getNumero_de_asientos() {
		return numero_de_asientos;
	}


	public void setNumero_de_asientos(int numero_de_asientos) {
		this.numero_de_asientos = numero_de_asientos;
	}


	public String[] getNombre_de_los_pasajeros() {
		return nombre_de_los_pasajeros;
	}


	public void setNombre_de_los_pasajeros(String[] nombre_de_los_pasajeros) {
		this.nombre_de_los_pasajeros = nombre_de_los_pasajeros;
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
