package com.otml.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.otml.entities.ServiceRequest;
import com.otml.entities.Technician;
import com.otml.util.HibernateUtil;

public class OneToManyListTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Technician technician=null;
		ServiceRequest request=null;
		ServiceRequest request1=null;
		List<ServiceRequest> serviceRequests=null;
		boolean flag = false;
		try {
			sessionFactory =HibernateUtil.getSessionFactory();
			session = sessionFactory.getCurrentSession();
			transaction = session.beginTransaction();

			//getTechnician(session);
			//getTechnicianById(session, 1);
			//getTechnicianByNameAndContactNo(session, "%s%","%90317110%" );
			//getServiceRequestByReqTechNo(session);//getting error
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
	
	static void getTechnician(Session session){
		//Criteria to get all records of Technician table
		Criteria c= session.createCriteria(Technician.class);
		//execute QBC logic
		List <Technician>technicians=c.list();
		// DB table ---> ResultSet --> Objs of Domain class--> List collection
		//process the Result
		for(Technician tc: technicians)
			System.out.println(tc);
	}

	static void getTechnicianById(Session session, int id){
		Criteria criteria= session.createCriteria(Technician.class);
		criteria.add(Restrictions.idEq(1));
		List<Technician> technicians=criteria.list();
		System.out.println("Technician by id="+technicians);
	}
	
	static void getTechnicianByNameAndContactNo(Session session, String name, String contactNo){
		Criteria criteria= session.createCriteria(Technician.class);
		criteria.add(Restrictions.and(Restrictions.ilike("technicianName", name),Restrictions.ilike("contactNo", contactNo)));
		List<Technician> technicians=criteria.list();
		System.out.println("Technician by name&contactNo="+technicians);
	}
	/*static void getServiceRequestByReqTechNo(Session session){
		Criteria c= session.createCriteria(ServiceRequest.class);
		c.add(Restrictions.sqlRestriction("Select customerName s from ServiceRequest s where REQ_TECHNICIAN_NO s= 1"));
		List<ServiceRequest> sr=c.list();
		System.out.println("Technician by name&contactNo="+sr);
	}*/
}