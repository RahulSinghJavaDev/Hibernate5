package com.hbg.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

public class HibernateUtil {
	// singleton sessionfactory
	private static SessionFactory sessionfactory;

	static {
		//Configuration configuration = new Configuration().configure("com/hbg/cfg/mysql-hibernate.cfg.xml");
		Configuration configuration = new Configuration().configure("com/hbg/cfg/hibernate.cfg.xml");
		//sessionfactory = configuration.buildSessionFactory();
		
		//StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder();
		builder.applySettings(configuration.getProperties());
		//builder.addService(ConnectionProvider.class,new getConnection());
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
