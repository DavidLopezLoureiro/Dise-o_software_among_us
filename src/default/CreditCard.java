import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class CreditCard extends Metodo_De_Pago {

	private int numero_de_targeta;
	private String nombre_del_titular;
	private int fecha_de_expiracion;
	
	
	public CreditCard(int numero_de_targeta, String nombre_del_titular, int fecha_de_expiracion) {
		super();
		this.numero_de_targeta = numero_de_targeta;
		this.nombre_del_titular = nombre_del_titular;
		this.fecha_de_expiracion = fecha_de_expiracion;
	}


	public int getNumero_de_targeta() {
		return numero_de_targeta;
	}


	public void setNumero_de_targeta(int numero_de_targeta) {
		this.numero_de_targeta = numero_de_targeta;
	}


	public String getNombre_del_titular() {
		return nombre_del_titular;
	}


	public void setNombre_del_titular(String nombre_del_titular) {
		this.nombre_del_titular = nombre_del_titular;
	}


	public int getFecha_de_expiracion() {
		return fecha_de_expiracion;
	}


	public void setFecha_de_expiracion(int fecha_de_expiracion) {
		this.fecha_de_expiracion = fecha_de_expiracion;
	}
	
	
}
