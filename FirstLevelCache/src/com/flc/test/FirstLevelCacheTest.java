package com.flc.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.flc.entity.Journey;
import com.flc.util.HibernateUtil;

public class FirstLevelCacheTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		// Transaction transaction=null;
		Journey journey = null;
		Journey journey1 = null;

		sessionFactory = HibernateUtil.getSessionFactory();
		/*
		 * Configuration configuration= new Configuration().configure();
		 * sessionFactory=configuration.buildSessionFactory();
		 */
		session = sessionFactory.openSession();

		/*
		 * journey= new Journey(); journey.setSource("Hyderabad");
		 * journey.setDestination("Bangalore");
		 * journey.setPassangers("Ravi,Suresh"); journey.setJourneyDate(new
		 * Date());
		 */

		try {
			/*
			 * transaction=session.beginTransaction(); session.save(journey);
			 * System.out.println(":::::::Data saved:::::::");
			 * transaction.commit();
			 */

			journey = (Journey) session.get(Journey.class, 1);
			System.out.println("First time from DB: " + journey);

			journey1 = (Journey) session.get(Journey.class, 1);
			System.out.println("Second time First level Cache: "+journey1);
			
		} catch (Exception e) {
			// transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			HibernateUtil.closeSessionFactory();
		}
	}
}
