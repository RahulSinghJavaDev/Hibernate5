package com.ip.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	// singleton sessionfactory
	private static SessionFactory sessionfactory;

	static {
		
		Configuration configuration = new Configuration().configure();
		//sessionfactory = configuration.buildSessionFactory();
		
		StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		StandardServiceRegistry serviceRegistry=builder.build();
		sessionfactory= configuration.buildSessionFactory(serviceRegistry);
	
	}

	public static SessionFactory getSesssionfactory() {
		return sessionfactory;
	}

	public static void closeSessionFactory() {
		if (sessionfactory != null) {
			sessionfactory.close();
		}
	}

}
