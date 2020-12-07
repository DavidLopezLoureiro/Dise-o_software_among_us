package EasyBooking;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.jdo.Transaction;


public class Main {

	public static void main(String[] args) {
	
	try {
		PersistenceManagerFactory persistentManagerFactory = JDOHelper.getPersistenceManagerFactory("datanucleus.properties");
		
		//Insert data in the DB
		PersistenceManager persistentManager = persistentManagerFactory.getPersistenceManager();				
		Transaction transaction = persistentManager.currentTransaction();				
		
		try {
		    transaction.begin();
		    
		    String[] nombres = {"David", "Jon", "Unai", "Javier"};
		    
		    Aerolinea aerolinea = new Aerolinea();
		    
			    aerolinea.setcodigoDeAerolinea("1");
			    aerolinea.setnombreDeAerolinea("Luftansa");
		    
		    Aeropuerto aeropuerto_s = new Aeropuerto();	
		   
		    	aeropuerto_s.setNombre("Bilbao");
		    	aeropuerto_s.setCodigo("a1");
		    
		    Aeropuerto aeropuerto_l = new Aeropuerto();
		    
			    aeropuerto_l.setNombre("Madrid");
		    	aeropuerto_l.setCodigo("a2");
		    
		    
		    CreditCard targeta = new CreditCard();
		    
		    	targeta.setnumeroDeTargeta(1);
		    	targeta.setnombreDelTitular("Yo");
		    	targeta.setfechaDeExpiracion(12022020);
		    
		    PayPal paypal = new PayPal();
			    
		    	paypal.setnombreDeUsuario("usuario");
		    	
		    Pago pago = new Pago();
		    
		    	pago.setFecha(12022020);
		    	pago.setMetodoDePago(paypal);
		    
		    Usuario usuario = new Usuario();
		    
		    	usuario.setEmail("@gmail.com");
		    	usuario.setredSocial("google");
		    	usuario.setHabitual(aeropuerto_s);
		    	usuario.setMetodo(paypal);
		    
		    Vuelo vuelo = new Vuelo();
		    
		    	vuelo.setcodigoDeVuelo("v1");
		    	vuelo.setFechaYHoraDeSalida(1212);
		    	vuelo.setfechaYHoraDeLlegada(1212);
		    	vuelo.setasientos_totales(40);
		    	vuelo.setasientosLibres(20);
		    	vuelo.setAerolinea(aerolinea);
		    	vuelo.setSalida(aeropuerto_s);
		    	vuelo.setLlegada(aeropuerto_l);
		    
		    Reserva reserva = new Reserva();
		    
		    	reserva.setUsuario(usuario);
		    	reserva.setnumeroDeAsientos(4);
		    	reserva.setnombreDeLosPasajeros(nombres);
		    	reserva.setPrecio(12.9f);
		    	reserva.setFecha(12032020);
		    	reserva.setVuelo(vuelo);
		    	reserva.setPago(pago);
		    
		    
		    persistentManager.makePersistent(aerolinea);
		    persistentManager.makePersistent(aeropuerto_s);
		    persistentManager.makePersistent(aeropuerto_l);
		    persistentManager.makePersistent(targeta);
		    persistentManager.makePersistent(pago);
		    persistentManager.makePersistent(paypal);
		    persistentManager.makePersistent(usuario);
		    persistentManager.makePersistent(vuelo);
		    persistentManager.makePersistent(reserva);
		    
		    System.out.println("+ Inserted aerolinea into db: " + aerolinea.getnombreDeAerolinea());
		    System.out.println("+ Inserted aeropuerto into db: " + aeropuerto_s.getNombre());
		    System.out.println("+ Inserted aeropuerto into db: " + aeropuerto_l.getNombre());
		    
		    System.out.println("+ Inserted targeta into db: " + targeta.getnombreDelTitular());
		    System.out.println("+ Inserted pago into db: " + pago.getFecha());
		    System.out.println("+ Inserted paypal into db: " + paypal.getnombreDeUsuario());
		    System.out.println("+ Inserted usuario into db: " + usuario.getEmail());
		    System.out.println("+ Inserted vuelo into db: " + vuelo.getcodigoDeVuelo());
		    System.out.println("+ Inserted reserva into db: " + reserva.getnumeroDeAsientos());
		    
		    transaction.commit();
		    
		} catch(Exception ex) {
			System.err.println("* Exception inserting data into db: " + ex.getMessage());
		} finally {		    
			if (transaction.isActive()) {
		        transaction.rollback();
		    }
		    
		    persistentManager.close();
		}
		
		//Select data using a Query
		persistentManager = persistentManagerFactory.getPersistenceManager();
		transaction = persistentManager.currentTransaction();
			
		try {
			transaction.begin();

			Query<CreditCard> productsQuery = persistentManager.newQuery(CreditCard.class);
		    productsQuery.setFilter("numeroDeTargeta == 1");
		    
		    
		    for (CreditCard targeta : productsQuery.executeList()) {
		        System.out.println("? Selected product from db: " + targeta.getnumeroDeTargeta());
		    }
		    	
		    transaction.commit();
		} catch(Exception ex) {
			System.err.println("* Exception executing a query: " + ex.getMessage());
		} finally {
			if (transaction.isActive()) {
		        transaction.rollback();
		    }

		    persistentManager.close();
		}			
		
		//Delete data using Extent
		persistentManager = persistentManagerFactory.getPersistenceManager();
		transaction = persistentManager.currentTransaction();
		
		try {
			transaction.begin();
			
		   
			Query<CreditCard> productsQuery = persistentManager.newQuery(CreditCard.class);
		    productsQuery.setFilter("numeroDeTargeta == 1");
		    	
		    
		    for (CreditCard targeta : productsQuery.executeList()) {
		        System.out.println("? Selected product from db: " + targeta.getnumeroDeTargeta());
		        System.out.println("- Deleted inventory from db: " + targeta.getnumeroDeTargeta());
		    	persistentManager.deletePersistent(targeta);
		    }
		 
		    transaction.commit();
		} catch(Exception ex) {
			System.err.println("* Exception deleting data from DB: " + ex.getMessage());
		} finally {
			if (transaction.isActive()) {
		        transaction.rollback();
		    }

		    persistentManager.close();
		}
		
	} catch (Exception ex) {
		System.err.println("* Exception: " + ex.getMessage());
	}
}
}



