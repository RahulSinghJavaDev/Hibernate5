package com.ch.util;

import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.ch.persistence.Student;

public class HibernateUtil {
	private static final SessionFactory sfactory;
		static{
				Properties props= new Properties();
				props.setProperty("Hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
				props.setProperty("Hibernate.connection.url", "jdbc:oracle:thin:@localhost:1521:xe");
				props.setProperty("Hibernate.connection.username", "system");
				props.setProperty("Hibernate.connection.password", "rahul");
				props.setProperty("dialect", "org.hibernate.dialect.Oracle10gDialect");
				
				/*
				 * There are different methods of AnnotationConfiguration like .addAnnotatedClass, .addProperties etc.
				 * There is .configure() methods which seeks hibernate.cfg, We need not to use .configure() if we are not intended to use hibernate.cfg.
			   */
								  sfactory= new AnnotationConfiguration()
										  					.addPackage("com.ch.persistence")
										  					.addProperties(props)
										  					.addClass(Student.class)
										  					.buildSessionFactory();
				
		}
		/*public static Session getSession()
				throws HibernateException {
				return sfactory.openSession();
				}
		
		 public static void closeSessionFactory() {
				if (sfactory != null) {
					sfactory.close();
				}
			}
		*/
		public static Session getSession()
				throws HibernateException {
				return sfactory.openSession();
				}
				public static void main(String... args){
				Session session=getSession();
				session.beginTransaction();
				Student st=(Student)session.get(Student.class, new Integer(1));
				System.out.println(st.getFirstName());
				session.close();
				}
}
