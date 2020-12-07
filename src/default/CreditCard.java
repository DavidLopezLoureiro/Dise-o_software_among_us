package EasyBooking;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;

@PersistenceCapable(detachable = "true")
@Inheritance(strategy = InheritanceStrategy.NEW_TABLE)
public class CreditCard extends Metodo_De_Pago {

	private int numeroDeTargeta;
	private String nombreDelTitular;
	private int fechaDeExpiracion;
	
	
	public CreditCard(int numeroDeTargeta, String nombreDelTitular, int fechaDeExpiracion) {
		super();
		this.numeroDeTargeta = numeroDeTargeta;
		this.nombreDelTitular = nombreDelTitular;
		this.fechaDeExpiracion = fechaDeExpiracion;
	}
	
	public CreditCard() {
		super();
	}


	public int getnumeroDeTargeta() {
		return numeroDeTargeta;
	}


	public void setnumeroDeTargeta(int numeroDeTargeta) {
		this.numeroDeTargeta = numeroDeTargeta;
	}


	public String getnombreDelTitular() {
		return nombreDelTitular;
	}


	public void setnombreDelTitular(String nombreDelTitular) {
		this.nombreDelTitular = nombreDelTitular;
	}


	public int getfechaDeExpiracion() {
		return fechaDeExpiracion;
	}


	public void setfechaDeExpiracion(int fechaDeExpiracion) {
		this.fechaDeExpiracion = fechaDeExpiracion;
	}
	
	
}
