package com.wwtx.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wwtx.entity.Project;

public class TxTest {

	public static void main(String[] args) {
	Configuration configuration=null;
	SessionFactory sFactory=null;
	Session session=null;
	Project project=null;
	Transaction tx=null;
	
	configuration= new Configuration().configure();
	sFactory= configuration.buildSessionFactory();
	session=sFactory.openSession();
	project=new Project();

	
	project.setProjectNo(1499);
	project.setTitle("Finance");
	project.setDescription("LIC application form ");
	project.setDomain("Finance");
	project.setDuration(6);
	project.setClient("LIC IND");
	project.setStatus("Development");
	
	try{
		tx=session.beginTransaction();
		session.save(project);
		System.out.println("Data Saved");
		tx.commit();
	}
	catch(Exception e){
		tx.rollback();
		e.printStackTrace();
	}
	session.close();
	sFactory.close();
	}

}
