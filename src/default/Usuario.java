import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Usuario {

	private String email;
	private String red_social;
	private Aeropuerto habitual;
	private Metodo_De_Pago metodo;
	

	public Usuario(String email, String red_social, Aeropuerto habitual, Metodo_De_Pago metodo){
		super();
		this.email = email;
		this.red_social = red_social;
		this.habitual = habitual;
		this.metodo = metodo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRed_social() {
		return red_social;
	}


	public void setRed_social(String red_social) {
		this.red_social = red_social;
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
