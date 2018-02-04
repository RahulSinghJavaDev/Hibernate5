package com.oto.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.oto.entities.NetworkPrefrences;

import com.oto.entities.Subscriber;
import com.oto.util.HibernateUtil;

public class OneToOneTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		Subscriber subscriber = null;
		NetworkPrefrences networkPrefrences = null;
		boolean flag = false;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			
			subscriber=new Subscriber();
			subscriber.setMemberName("Rakesh Sharma");
			subscriber.setConnectionType("Pre-Paid");
			subscriber.setMobileNo("9576111264");
			subscriber.setSimType("GSM-4G");
			
			session.save(subscriber);

			networkPrefrences = new NetworkPrefrences();
			
			networkPrefrences.setCallForwarding(false);
			networkPrefrences.setCallWaiting(true);
			networkPrefrences.setInternet(true);
			networkPrefrences.setMissedCallAlert(true);
			networkPrefrences.setVoiceMailbox(true);
			networkPrefrences.setSubscriber(subscriber);
			
			session.save(networkPrefrences);

			flag = true;
		}finally {
			if (transaction != null) {
				if (flag == true) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
		}
		HibernateUtil.closeSessionFactory();
	}
}