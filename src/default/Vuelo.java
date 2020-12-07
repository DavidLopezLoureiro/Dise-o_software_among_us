package EasyBooking;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Vuelo {
	private String codigoDeVuelo;
	private int fechaYHoraDeSalida;
	private int fechaYHoraDeLlegada;
	private int asientosTotales;
	private int asientosLibres;
	private Aerolinea aerolinea;
	private Aeropuerto salida; 
	private Aeropuerto llegada;
	
	
	public Vuelo(String codigoDeVuelo, int fechaYHoraDeSalida, int fechaYHoraDeLlegada, int asientosTotales,
			int asientosLibres, Aerolinea aerolinea, Aeropuerto salida, Aeropuerto llegada) {
		super();
		this.codigoDeVuelo = codigoDeVuelo;
		this.fechaYHoraDeSalida = fechaYHoraDeSalida;
		this.fechaYHoraDeLlegada = fechaYHoraDeLlegada;
		this.asientosTotales = asientosTotales;
		this.asientosLibres = asientosLibres;
		this.aerolinea = aerolinea;
		this.salida = salida;
		this.llegada = llegada;
	}
	
	public Vuelo() {
		super();
	}

	public String getcodigoDeVuelo() {
		return codigoDeVuelo;
	}


	public void setcodigoDeVuelo(String codigoDeVuelo) {
		this.codigoDeVuelo = codigoDeVuelo;
	}


	public int getFecha_y_hora_de_salida() {
		return fechaYHoraDeSalida;
	}


	public void setFechaYHoraDeSalida(int fechaYHoraDeSalida) {
		this.fechaYHoraDeSalida = fechaYHoraDeSalida;
	}


	public int getFechaYHoraDeLlegada() {
		return fechaYHoraDeLlegada;
	}


	public void setfechaYHoraDeLlegada(int fechaYHoraDeLlegada) {
		this.fechaYHoraDeLlegada = fechaYHoraDeLlegada;
	}


	public int getasientosTotales() {
		return asientosTotales;
	}


	public void setasientos_totales(int asientosTotales) {
		this.asientosTotales = asientosTotales;
	}


	public int getasientosLibres() {
		return asientosLibres;
	}


	public void setasientosLibres(int asientosLibres) {
		this.asientosLibres = asientosLibres;
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
