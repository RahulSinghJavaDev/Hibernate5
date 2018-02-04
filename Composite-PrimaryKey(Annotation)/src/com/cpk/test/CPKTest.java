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
	    //getting sessionfactory 	
		sessionFactory=HibernateUtil.getSesssionfactory();
		
		session=sessionFactory.openSession();
		product= new Product();
		productpk= new ProductPK();
		//setting values
		productpk.setBatchCode(525);
		productpk.setProductId("mi997");
		
		/*product.setId(productpk);
		product.setDescription("mi mobile");
		product.setManufacturer("Xaomi india");
		product.setManufacturedDate(new Date());
		product.setPrice(25000.0f);
		product.setProductName(" mi note4 mobile");*/
		
     try{
			/*transaction= session.beginTransaction();
		    session.save(product);
		    transaction.commit();
			System.out.println(":::::::::Data Saved:::::::::");*/
    	 //getting value
    	 product=(Product) session.get(Product.class, productpk);
    	System.out.println(product);
    	System.out.println(product.getManufacturer());
    	
			}
	
		catch(Exception e){
			//transaction.rollback();
			e.printStackTrace();
		}
		session.close();
		//sessionFactory.close();
		HibernateUtil.closeSessionFactory();
	   }
	
	}
