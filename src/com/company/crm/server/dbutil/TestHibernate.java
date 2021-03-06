package com.company.crm.server.dbutil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.company.crm.shared.dom.ContactType;


public class TestHibernate {

	public static void main(String[] args) {
	
	/*	Configuration config = new Configuration();
		config.addAnnotatedClass(ContactTable.class);
		config.addAnnotatedClass(ContactTypeTable.class);
		config.addAnnotatedClass(ContragentTable.class);
		config.addAnnotatedClass(UserTable.class);
		
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);*/
		
		SessionFactory sesionFactory = HibernateSessionFactory.getSessionFactory();
	    Session session = sesionFactory.openSession();
		session.beginTransaction();
		for (int i = 0; i <75; i++) {
			ContactType contactType = new ContactType("Contact type " + i);
			session.save(contactType);
		}
		
		session.getTransaction().commit();
		session.close(); 
	//	sesionFactory.close();
		System.exit(1);
		
	}

}
