package com.ch.test;

import org.hibernate.Session;
import com.ch.persistence.Student;
import com.ch.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Session session=null;
		Student student=null;
		try {
			 session=HibernateUtil.getSession();
			 student = (Student) session.get(Student.class, 1);
			 System.out.println(student);
			 System.out.println(student.getFirstName());

		} finally {
			if (session != null) {
				session.close();
			}

		}

	}

}
