package com.bshb.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bshb.entity.Student;

public class BSHBTest {

	public static void main(String[] args) {
		//Configuration configuration= new Configuration();
		//configuration.addResource("com/bshb/config/student.hbm.xml");
		Configuration configuration= new Configuration().configure("com/bshb/config/Hibernate.cfg.xml");
		SessionFactory sessionFactory= configuration.buildSessionFactory();
		Session session= sessionFactory.openSession();
		Student student=(Student)session.get(Student.class, 1);
		System.out.println(student);

		session.close();
		sessionFactory.close();
	}

}
