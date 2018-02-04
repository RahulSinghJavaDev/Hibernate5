package com.otomo.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otomo.entities.Admission;
import com.otomo.entities.Student;
import com.otomo.util.HibernateUtil;

public class OneToOneTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		Session session = null;
		Student student = null;
		Admission admission = null;
		boolean flag = false;
		try {
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();

			admission = new Admission();
			admission.setStudentName("Suraj");
			admission.setStandard("XII");
			admission.setAcadmicYear(2017);
			admission.setAdmissionDate(new Date());
			admission.setAdmissionFee(10000.99f);
			session.save(admission);

			student = new Student();
			student.setFirstName("Suraj");
			student.setLastName("Reddy");
			student.setAge(18);
			student.setGender("male");
			student.setStandard("XII");
			student.setSection("C");
			student.setAdmission(admission);
			session.save(student);

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