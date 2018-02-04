package com.cpk.test;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cpk.entities.Product;
import com.cpk.entities.ProductPK;
import com.cpk.util.HibernateUtil;

public class CPKTest {

	public static void main(String[] args) {
		
		Product product=null;
		ProductPK productpk=null;
		Session session=null;
		Transaction transaction=null;
		SessionFactory sessionFactory=null;
		
		sessionFactory=HibernateUtil.getSesssionfactory();
		/*Configuration configuration= new Configuration().configure();
		sessionFactory=configuration.buildSessionFactory();*/
		session=sessionFactory.openSession();
		product= new Product();
		productpk= new ProductPK();
		//setting values
		productpk.setBatchCode(7999);
		productpk.setProductId("lenevo7");
		
		/*product.setId(productpk);
		product.setDescription("lenevo mobile");
		product.setManufacturer("lenevo india");
		product.setManufacturedDate(new Date());
		product.setPrice(15000.0f);
		product.setProductName("K4 note mobile");*/
		
     try{
			/*transaction= session.beginTransaction();
		    session.save(product);
		    transaction.commit();
			System.out.println(":::::::::Data Saved:::::::::");*/
    	 //getting value
    	 product=(Product) session.get(Product.class, productpk);
    	System.out.println(product.getDescription());
    	
			}
	
		catch(Exception e){
			transaction.rollback();
			e.printStackTrace();
		}
		session.close();
		//sessionFactory.close();
		HibernateUtil.closeSessionFactory();
	   }
	
	}
