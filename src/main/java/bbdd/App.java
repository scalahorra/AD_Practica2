package bbdd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import modelo.Cliente;

public class App {

	public static void main(String[] args) {
		
		SessionFactory miFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Cliente.class).buildSessionFactory();		
		Session miSession = miFactory.openSession();
		
		try {
			
			Cliente cliente1 = new Cliente(1, "Sergio", 678541269, 2547, "Calle Pepe", "Zaragoza");			
			miSession.beginTransaction();			
			miSession.save(cliente1);			
			miSession.getTransaction().commit();
			
			System.out.println("Registro insertado correctamente");
			
			miSession.close();
			
		}finally {			
			miFactory.close();
		}
	}
}
