package com.hblc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hblc.entity.TravelAgency;
import com.hblc.util.HibernateUtil;

public class HBLifeCycleTest {

	public static void main(String[] args) {
		Transaction transaction= null;
		boolean flag=false;
		SessionFactory sessionFactory=null;
		Session session= null;
		TravelAgency agency= null;
		try{
		sessionFactory= HibernateUtil.getSessionFactory();
		session= sessionFactory.openSession();
		//When ever an object of a pojo class is created then it will be in the "Transient State"
		
		// Transient state_____start
		agency= new TravelAgency();
		agency.setBookingId(9779);
		agency.setMemberName("Suresh");
		agency.setPlanName("Trip to Ranchi");
		agency.setPrice(10000.00f);
		agency.setTourplanId(1555);
		// Transient state_____end
		
		// Persistent state_____start
		transaction=session.beginTransaction();
		//Having the relation with the database, associated with a unique Session object is "Persistent State"
		int i=(Integer)session.save(agency);
		// Persistent state_____end
		
		//Detached objects have a representation in the database, but changes to the object will not be reflected in the database, and vice-versa 
		//Detached state
		session.evict(agency);
		
		System.out.println("Data saved with id: "+i);
		flag=true;
		}
		finally{
			if(session!=null){
				if(flag=true)
	   transaction.commit();
			}
			else{
				transaction.rollback();
			}
		//Detached state
	   session.close();
	   HibernateUtil.closeSessionFactory();
		}

	}
}