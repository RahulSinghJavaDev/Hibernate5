package com.otml.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otml.entities.ServiceRequest;
import com.otml.entities.Technician;
import com.otml.util.HibernateUtil;

public class OneToManyListTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Technician technician=null;
		Technician technician1=null;
		ServiceRequest request=null;
		ServiceRequest request1=null;
		List<ServiceRequest> serviceRequests=null;
		List<ServiceRequest> serviceRequests1=null;
		boolean flag = false;
		try {
			sessionFactory =HibernateUtil.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();
			serviceRequests= new ArrayList<ServiceRequest>();
			serviceRequests1= new ArrayList<ServiceRequest>();
			
			request= new ServiceRequest();
			request.setCustomerName("Ravi verma");
			request.setProblemDescription("Screen Broken");
			request.setRequestDate("2017-05-03");
			request.setEta(24);
			request.setStatus("Open");
			session.save(request);
			
			request1= new ServiceRequest();
			request1.setCustomerName("Vjiay Rao");
			request1.setProblemDescription("Battery low");
			request1.setRequestDate("2017-07-02");
			request1.setEta(12);
			request1.setStatus("Open");
			session.save(request1);
			
			serviceRequests.add(request);
			serviceRequests1.add(request1);
			
			technician= new Technician();
			technician.setTechnicianName("Susil");
			technician.setContactNo("9031711066");
			technician.setEmailAddress("susil@samsung.com");
			technician.setDesignation("Service engineer");
			technician.setExperience("2yrs");
			technician.setServiceRequests(serviceRequests);
			session.save(technician);
			
			technician1= new Technician();
			technician1.setTechnicianName("Karan");
			technician1.setContactNo("90317333066");
			technician1.setEmailAddress("susil@samsung.com");
			technician1.setDesignation("Service engineer");
			technician1.setExperience("2.5yrs");
			technician1.setServiceRequests(serviceRequests1);
			session.save(technician1);
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