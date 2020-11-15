import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class PayPal extends Metodo_De_Pago{
	private String nombre_de_usuario;
	
	
	public PayPal(String nombre_de_usuario) {
		super();
		this.nombre_de_usuario = nombre_de_usuario;
	}


	public String getNombre_de_usuario() {
		return nombre_de_usuario;
	}


	public void setNombre_de_usuario(String nombre_de_usuario) {
		this.nombre_de_usuario = nombre_de_usuario;
	}
	
	
}
