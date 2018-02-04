package com.otms.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otms.entities.Restaurant;
import com.otms.entities.Review;
import com.otms.util.HibernateUtil;

public class OneToManySetTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Restaurant restaurant = null;
		Review review = null;
		Review review1 = null;
		Set<Review> reviews = null;
		boolean flag = false;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			reviews = new HashSet<>();

			review = new Review();
			review.setReviewBy("Sunil");
			review.setRating(4);
			review.setComment("Good Food");
			review.setReviewDate(new Date());
			session.save(review);

			review1 = new Review();
			review1.setReviewBy("Anil");
			review1.setRating(3);
			review1.setComment("Nice Food");
			review1.setReviewDate(new Date());
			session.save(review1);

			reviews.add(review);
			reviews.add(review1);

			restaurant = new Restaurant();
			restaurant.setRestaurantName("Taj Hotel");
			restaurant.setLocation("Banjara Hills, HYD");
			restaurant.setContactNo("0657-2237859");
			restaurant.setType("Luxury");
			restaurant.setReviews(reviews);
            int serialNo=(Integer)session.save(restaurant);
            System.out.println("SerialNo:"+ serialNo);
			flag = true;
		} finally {
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