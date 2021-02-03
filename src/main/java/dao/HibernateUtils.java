package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static Session session;
	
	private HibernateUtils() {
		
	}
	
	public static Session getSession() throws Exception{
		
		if(session==null) {
			Configuration configuration = new Configuration().configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
				session=sessionFactory.openSession();
			}
		return session;		
	}
}
