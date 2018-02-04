package com.ip.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ip.entities.ITCFoodProduct;
import com.ip.entities.ITCProduct;
import com.ip.util.HibernateUtil;

public class IPTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		ITCProduct itcProduct=null;
		ITCFoodProduct foodProduct=null;
		boolean flag=false;
		try{
			sessionFactory= HibernateUtil.getSesssionfactory();
			session=sessionFactory.getCurrentSession();
			transaction=session.beginTransaction();
			
			itcProduct= new ITCProduct();
			itcProduct.setProductName("facewash");
			itcProduct.setManufacturedDate(new Date());
			itcProduct.setPrice(105.00f);
			itcProduct.setWeight(250);
			
			session.save(itcProduct);
			
			foodProduct= new ITCFoodProduct();
			foodProduct.setExpirationDate(new Date());
			foodProduct.setDescription("best for dry face");
			foodProduct.setProductionFactory("ITC Mumbai");
			foodProduct.setProductName("facewash");
			foodProduct.setManufacturedDate(new Date());
			foodProduct.setPrice(105.00f);
			foodProduct.setWeight(250);
			
			session.save(foodProduct);
			
			flag=true;
		}finally{
			if(transaction!=null){
				if(flag){
					transaction.commit();
				}else {
					transaction.rollback();
				}
			}
		}
		HibernateUtil.closeSessionFactory();
	}

}
