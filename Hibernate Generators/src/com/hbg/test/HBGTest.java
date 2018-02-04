package com.hbg.test;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbg.entity.Appointment;
import com.hbg.util.HibernateUtil;

public class HBGTest {

	public static void main(String[] args) {
		Transaction tx=null;
		SessionFactory sessionFactory=null;
		Session session= null;
		Appointment appointment=null;
		
		sessionFactory= HibernateUtil.getSesssionfactory();
		/*session=sessionFactory.openSession();
		appointment= new Appointment();*/
		
		for(int ic=0;ic<5;ic++){
			session=sessionFactory.openSession();
			appointment= new Appointment();
			appointment.setAppDate(new Date());
			appointment.setDoctor("Dr. Riya");
			appointment.setPatient("Susmita");
			appointment.setStatus("cancelled");
			tx= session.beginTransaction();
			Serializable i=session.save(appointment);
			System.out.println("Data Saved");
			System.out.println("value: "+i);
		   tx.commit();
       }
		/*appointment.setAppDate(new Date());
		appointment.setDoctor("Dr. Riya");
		appointment.setPatient("Suman");
		appointment.setStatus("cancelled");
		
		try{
			
			tx= session.beginTransaction();
			Serializable i=session.save(appointment);
			System.out.println("Data Saved");
			System.out.println("value: "+i);
			tx.commit();
			}
	
		catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}*/
		session.close();
		HibernateUtil.closeSessionFactory();
	   }
	
}
