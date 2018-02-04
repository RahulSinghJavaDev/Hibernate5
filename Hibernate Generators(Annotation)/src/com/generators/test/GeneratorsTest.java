package com.generators.test;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.generators.entity.Products;
import com.generators.util.HibernateUtil;

public class GeneratorsTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		Products products=null;
		
		sessionFactory=HibernateUtil.getSessionFactory();
		
		/*Configuration configuration= new Configuration().configure("com/generators/config/hibernate.cfg.xml");
		sessionFactory=configuration.buildSessionFactory();*/
		
		session=sessionFactory.openSession();
		products= new Products();
		
		products.setProductName("Samsung Galaxy s6 edge");
		products.setDescription("5.5inch full HD curved display");
		products.setPrice(63999.99f);
		products.setAvailablity(10);
		
		try{
			transaction=session.beginTransaction();
			int i=(int) session.save(products);
			transaction.commit();
			System.out.println("::::::::::::::::::::::::::Data Saved:::::::::::::::::::::::::::");
			System.out.println(products);
		}
		catch(Exception e){
			transaction.rollback();
			e.printStackTrace();
		}

	}

}
