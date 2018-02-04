package com.otmm.test;

import java.util.Date;
import java.util.HashMap;

import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otmm.entities.Cargo;
import com.otmm.entities.Load;
import com.otmm.util.HibernateUtil;

public class OneToManyMapTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Cargo cargo = null;
		Load load = null;
		Load load1 = null;
		Map<String, Load> loads = null;
		boolean flag = false;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			loads = new HashMap<String, Load>();

			load = new Load();
			load.setOwner("Flipkart");
			load.setShippingDate(new Date());
			load.setWeight(2500);
			load.setDescription("Handel with care glass items");
			session.save(load);

			load1 = new Load();
			load1.setOwner("Nokia");
			load1.setShippingDate(new Date());
			load1.setWeight(5000);
			load1.setDescription("Electrnic goods");
			session.save(load1);

			loads.put("SP121", load);
			loads.put("SP551", load1);

			cargo = new Cargo();
			cargo.setCargoName("EastCost-Sea");
			cargo.setCargoCountry("IND");
			cargo.setCapacity(100000);
			cargo.setType("BigJCBS");
			cargo.setLoads(loads);
			int cNo = (Integer) session.save(cargo);
			System.out.println("Cargo No: " + cNo);

			flag = true;
		} finally {
			if (transaction != null) {
				if (flag == true) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
			}
			HibernateUtil.closeSessionFactory();
		}

	}

}
