package EasyBooking;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;

@PersistenceCapable(detachable = "true")
@Inheritance(strategy = InheritanceStrategy.NEW_TABLE)
public class PayPal extends Metodo_De_Pago{
	private String nombreDeUsuario;
	
	public PayPal() {
		super();
		
	}

	public String getnombreDeUsuario() {
		return nombreDeUsuario;
	}


	public void setnombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}
	
	
}
