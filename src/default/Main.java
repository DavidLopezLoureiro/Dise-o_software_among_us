import javax.jdo.Extent;
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
		    
		    Aerolinea aerolinea = new Aerolinea("1","Luftansa");
		    Aeropuerto aeropuerto_s = new Aeropuerto("Bilbao","a1");	
		    Aeropuerto aeropuerto_l = new Aeropuerto("Madrid","a2");
		    
		    CreditCard targeta = new CreditCard(1, "Yo", 12022020);
		    Pago pago = new Pago(12022020);
		    PayPal paypal = new PayPal("usuario");
		    Usuario usuario = new Usuario("@gmail.com", "google", aeropuerto_s, paypal);
		    Vuelo vuelo = new Vuelo("v1", 1212, 1212, 40, 20, aerolinea, aeropuerto_s, aeropuerto_l);
		    Reserva reserva = new Reserva(usuario, 4, nombres , 12.9f, 12032020, vuelo);
		    
		    persistentManager.makePersistent(aerolinea);
		    persistentManager.makePersistent(aeropuerto_s);
		    persistentManager.makePersistent(aeropuerto_l);
		    
		    persistentManager.makePersistent(targeta);
		    persistentManager.makePersistent(pago);
		    persistentManager.makePersistent(paypal);
		    persistentManager.makePersistent(usuario);
		    persistentManager.makePersistent(vuelo);
		    persistentManager.makePersistent(reserva);
		    
		    System.out.println("+ Inserted aerolinea into db: " + aerolinea.getNombre_de_aerolinea());
		    System.out.println("+ Inserted aeropuerto into db: " + aeropuerto_s.getNombre());
		    System.out.println("+ Inserted aeropuerto into db: " + aeropuerto_l.getNombre());
		    
		    System.out.println("+ Inserted targeta into db: " + targeta.getNombre_del_titular());
		    System.out.println("+ Inserted pago into db: " + pago.getFecha());
		    System.out.println("+ Inserted paypal into db: " + paypal.getNombre_de_usuario());
		    System.out.println("+ Inserted usuario into db: " + usuario.getEmail());
		    System.out.println("+ Inserted vuelo into db: " + vuelo.getCodigo_de_vuelo());
		    System.out.println("+ Inserted reserva into db: " + reserva.getNumero_de_asientos());
		    
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

		    @SuppressWarnings("unchecked")
			Query<Usuario> productsQuery = persistentManager.newQuery("SELECT FROM " + Usuario.class.getName() + " WHERE email == '@gmail.com'");
		    
		    for (Usuario usuario : productsQuery.executeList()) {
		        System.out.println("? Selected product from db: " + usuario.getEmail());
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
			
		    @SuppressWarnings("unchecked")
		    Query<Usuario> productsQuery = persistentManager.newQuery("SELECT FROM " + Usuario.class.getName() + " WHERE email == '@gmail.com'");
		    
		    for (Usuario usuario : productsQuery.executeList()) {
		        System.out.println("? Selected product from db: " + usuario.getEmail());
		    }
			
			Extent<Usuario> inventoryExtent = persistentManager.getExtent(Usuario.class);
		    
		    for (Usuario usuario : inventoryExtent) {
		    	System.out.println("- Deleted inventory from db: " + usuario.getEmail());
		    	persistentManager.deletePersistent(usuario);			        
		    }
		    transaction.commit();
		} catch(Exception ed) {
			System.err.println("* Exception deleting data from DB: " + ed.getMessage());
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
