import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Vuelo {
	private String codigo_de_vuelo;
	private int fecha_y_hora_de_salida;
	private int fecha_y_hora_de_llegada;
	private int asientos_totales;
	private int asientos_libres;
	private Aerolinea aerolinea;
	private Aeropuerto salida; 
	private Aeropuerto llegada;
	
	
	public Vuelo(String codigo_de_vuelo, int fecha_y_hora_de_salida, int fecha_y_hora_de_llegada, int asientos_totales,
			int asientos_libres, Aerolinea aerolinea, Aeropuerto salida, Aeropuerto llegada) {
		super();
		this.codigo_de_vuelo = codigo_de_vuelo;
		this.fecha_y_hora_de_salida = fecha_y_hora_de_salida;
		this.fecha_y_hora_de_llegada = fecha_y_hora_de_llegada;
		this.asientos_totales = asientos_totales;
		this.asientos_libres = asientos_libres;
		this.aerolinea = aerolinea;
		this.salida = salida;
		this.llegada = llegada;
	}


	public String getCodigo_de_vuelo() {
		return codigo_de_vuelo;
	}


	public void setCodigo_de_vuelo(String codigo_de_vuelo) {
		this.codigo_de_vuelo = codigo_de_vuelo;
	}


	public int getFecha_y_hora_de_salida() {
		return fecha_y_hora_de_salida;
	}


	public void setFecha_y_hora_de_salida(int fecha_y_hora_de_salida) {
		this.fecha_y_hora_de_salida = fecha_y_hora_de_salida;
	}


	public int getFecha_y_hora_de_llegada() {
		return fecha_y_hora_de_llegada;
	}


	public void setFecha_y_hora_de_llegada(int fecha_y_hora_de_llegada) {
		this.fecha_y_hora_de_llegada = fecha_y_hora_de_llegada;
	}


	public int getAsientos_totales() {
		return asientos_totales;
	}


	public void setAsientos_totales(int asientos_totales) {
		this.asientos_totales = asientos_totales;
	}


	public int getAsientos_libres() {
		return asientos_libres;
	}


	public void setAsientos_libres(int asientos_libres) {
		this.asientos_libres = asientos_libres;
	}


	public Aerolinea getAerolinea() {
		return aerolinea;
	}


	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}


	public Aeropuerto getSalida() {
		return salida;
	}


	public void setSalida(Aeropuerto salida) {
		this.salida = salida;
	}


	public Aeropuerto getLlegada() {
		return llegada;
	}


	public void setLlegada(Aeropuerto llegada) {
		this.llegada = llegada;
	}
	
	

}
