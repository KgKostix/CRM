package com.company.crm.server.dbutil;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateSessionFactory {

	private HibernateSessionFactory () {		
	};
		
	private static SessionFactory sessionFactory = buildSessionFactory();
			

	private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            Configuration configuration =  new Configuration().configure("hibernate.cfg.xml");
            ServiceRegistry serviceRegistry =  new StandardServiceRegistryBuilder()
            		.applySettings(configuration.getProperties()).build();
            
            return configuration.buildSessionFactory(serviceRegistry);
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.out.println("Initial SessionFactory creation failed. " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
    	if (sessionFactory == null) {
    		sessionFactory = buildSessionFactory();
    	}
        return sessionFactory;
    }		

    public static Session getSession() {
    	Session session = null;
    	if (sessionFactory == null) {
    		sessionFactory = getSessionFactory();
    	}
		if (sessionFactory != null) {
			session = sessionFactory.openSession();			
		}
    	return session;
    }
}
