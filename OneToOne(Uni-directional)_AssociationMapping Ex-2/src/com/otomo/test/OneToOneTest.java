package com.otomo.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otomo.entities.DigitalBox;
import com.otomo.entities.DigitalCard;
import com.otomo.util.HibernateUtil;

public class OneToOneTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		DigitalBox box = null;
		DigitalCard card = null;
		boolean flag = false;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();

			card = new DigitalCard();
			card.setProvider("TataSky");
			card.setPurchaseDate(new Date());
			card.setSuscriberName("Sunil Sharma");

			int i = (Integer) session.save(card);
			System.out.println("Digicard saved with id: " + i);

			box = new DigitalBox();
			box.setManufacturer("Huwai");
			box.setModel("4K-TV");
			box.setType("D2H");
			box.setWarranty(1);
			box.setDigitalCard(card);

			int j = (Integer) session.save(box);
			System.out.println("Digibox saved with id: " + j);

			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
		}
		HibernateUtil.closeSessionFactory();

	}

}
