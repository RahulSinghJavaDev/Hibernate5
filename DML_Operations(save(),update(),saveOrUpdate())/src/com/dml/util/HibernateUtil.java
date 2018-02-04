package com.dml.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	static{
		Configuration configuration= new Configuration().configure();
		StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		StandardServiceRegistry serviceRegistry= builder.build();
		sessionFactory= configuration.buildSessionFactory(serviceRegistry);
	}
	public static SessionFactory getSesssionfactory() {
		return sessionFactory;
	}
	public static void closeSessionfactory(){
	 if(sessionFactory!=null){
		 sessionFactory.close();
	 }
	}
}
