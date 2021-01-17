package EasyBooking;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Usuario {

	private String email;
	private String redSocial;
	private Aeropuerto habitual;
	private Metodo_De_Pago metodo;
	private List<Reserva> reservas = new ArrayList<Reserva>();
	

	
	public List<Reserva> getReservas() {
		return reservas;
	}


	public void addReservas(Reserva reservas) {
		this.reservas.add(reservas);
	}


	public Usuario(){
		super();
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRed_social() {
		return redSocial;
	}


	public void setredSocial(String redSocial) {
		this.redSocial = redSocial;
	}


	public Aeropuerto getHabitual() {
		return habitual;
	}


	public void setHabitual(Aeropuerto habitual) {
		this.habitual = habitual;
	}


	public Metodo_De_Pago getMetodo() {
		return metodo;
	}


	public void setMetodo(Metodo_De_Pago metodo) {
		this.metodo = metodo;
	}

}
