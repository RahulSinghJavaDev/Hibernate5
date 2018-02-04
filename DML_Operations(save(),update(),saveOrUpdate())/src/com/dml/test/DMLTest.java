package com.dml.test;

import java.security.Policy;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dml.entities.InsurancePolicy;
import com.dml.util.HibernateUtil;

public class DMLTest {

	public static void main(String[] args) {
		Transaction transaction = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		InsurancePolicy iPolicy=null;

		sessionFactory = HibernateUtil.getSesssionfactory();
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			iPolicy= new InsurancePolicy();
			iPolicy.setPolicyNo(13);
			/*iPolicy.setPolicyholderName("Ranjan Verma");
			iPolicy.setPloicyName("LIC Suraksha plan");
			iPolicy.setEffectiveDate(new Date());
			iPolicy.setTenure(24);
			iPolicy.setPremiumAmount(15999f);*/
			
			//save() operation
			/*int i= (Integer) session.save(iPolicy);
			transaction.commit();
			session.flush();
			System.out.println("Return Value: "+i);
			System.out.println("getting policy no: "+ iPolicy.getPolicyNo());*/
			
			//persist() operation
			/*session.persist(iPolicy);
			transaction.commit();
			session.flush();
			System.out.println("getting policy no: "+ iPolicy.getPolicyNo());*/
			
			//saveOrUpdate() operation
			/*session.saveOrUpdate(iPolicy);
			transaction.commit();*/
			
			//update() operation
			/*session.update(iPolicy);
			transaction.commit();*/
			
			
			//merge() operation
			/*session.save(iPolicy);		
			iPolicy=(InsurancePolicy)session.get(InsurancePolicy.class, 11);
			
			InsurancePolicy uiPolicy= new InsurancePolicy();
			uiPolicy.setPolicyNo(11);
			uiPolicy.setPolicyholderName("Rakesh Verma");
			uiPolicy.setPloicyName("LIC Suraksha plan");
			uiPolicy.setEffectiveDate(new Date());
			uiPolicy.setTenure(24);
			uiPolicy.setPremiumAmount(16999f);
			
			session.merge(uiPolicy);
			transaction.commit();*/
			
			//merge() operation{working same as update()}
			/*iPolicy.setPolicyNo(11);
			iPolicy.setPolicyholderName("Ravi");
			session.merge(iPolicy);
			transaction.commit();*/
			
			//delete() operationy
			iPolicy.getPolicyNo();
			session.delete(iPolicy);
			
			transaction.commit();
			
			//System.out.println("getting policy no: "+ iPolicy.getPolicyNo());
			
		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
			HibernateUtil.closeSessionfactory();
		}

	}

}
