package EasyBooking;
import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Usuario {

	private String email;
	private String redSocial;
	private Aeropuerto habitual;
	private Metodo_De_Pago metodo;
	

	public Usuario(String email, String redSocial, Aeropuerto habitual, Metodo_De_Pago metodo){
		super();
		this.email = email;
		this.redSocial = redSocial;
		this.habitual = habitual;
		this.metodo = metodo;
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
