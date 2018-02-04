package com.hql.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hql.entities.Employee;
import com.hql.util.HibernateUtil;

public class HQLTest {

	public static void main(String[] args) {
		boolean flag = false;
		SessionFactory sFactory = null;
		Session session = null;
		Transaction trnx = null;
		Employee employee = null;

		try {
			sFactory = HibernateUtil.getSessionFactory();
			
			session = sFactory.openSession();
			trnx = session.beginTransaction();
			employee = new Employee();
		/*//Saving data
			emp = new Employee();
			emp.setDesignation("Senior Developer");
			emp.setDepartment("Web development");
			emp.setEmployeeName("Jhon");
			emp.setExperience("3yrs");
			emp.setSalary(600000.00f);
			int empno = (Integer) session.save(emp);
			System.out.println("empno: " + empno);*/
		
			
			/*//HQL example - Get All Employees
			Query query = session.createQuery("from Employee");
			List<Employee> empList = query.list();
			System.out.println(Arrays.asList(empList));
			for(Employee emp : empList){
				System.out.println("List of Employees::"+ emp);
			}
		
			//HQL example - Get Employee with id
			query = session.createQuery("from Employee where id= :id");
			query.setInteger("id", 2);
			List emp = query.list();
			System.out.println("Employee Details"+emp);
			
			//HQL pagination example
			query = session.createQuery("from Employee");
			query.setFirstResult(0); //starts with 0
			query.setFetchSize(2);
			empList = query.list();
			for(Employee emp4 : empList){
				System.out.println("Paginated Employees::"+emp4.getEmployeeId()+","+emp4.getDepartment());
			}
			
			//HQL Update Employee
			Query query=null;
			query = session.createQuery("UPDATE Employee SET EMP_NAME= :name where EMP_ID= :id");
			query.setParameter("name", "Rod");
			query.setInteger("id", 1);
			int result = query.executeUpdate();
			System.out.println("Employee Update Status="+result);

			//HQL Delete Employee
			Query query= session.createQuery("DELETE FROM Employee where EMP_ID= :id");
			query.setParameter("id", 2);
			int result=query.executeUpdate();
			System.out.println("Employee delete status="+result); */
			
/*			//HQL Aggregate function
			Query query=session.createQuery("SELECT max(salary) FROM Employee");
			List maxSalary=query.list();
			System.out.println("MAX SALARY="+ maxSalary);
			
			Query query1=session.createQuery("SELECT sum(salary) FROM Employee");
			List sumSalary=query1.list();
			System.out.println("SUM SALARY="+ maxSalary);
			
			Query query2=session.createQuery("SELECT avg(salary) FROM Employee");
			List avgSalary=query2.list();
			System.out.println("AVG SALARY="+ avgSalary);
			
			Query query3=session.createQuery("SELECT count(*) FROM Employee");
			List countOfEmployee=query3.list();
			System.out.println("NO OF EMP="+ countOfEmployee);
			
			Query query4=session.createQuery("SELECT replace(employeeName,'') FROM Employee");
			List concate=query4.list();
			System.out.println("CONCATE="+ concate); */
				
			/*//HQL Aggregate function examples
			Query query6 = session.createQuery("select sum(salary) from Employee");
			double sumSalaryy = (Double) query6.uniqueResult();
			System.out.println("Sum of all Salaries= "+sumSalaryy);*/
			
			//Named Query
			Query query=session.getNamedQuery("getAllEmployees");
			List<Employee> empList = query.list();
			System.out.println("All Emp="+empList);
			
				flag = true;
		} finally {
			if (trnx != null) {
				if (flag) {
					trnx.commit();
				} else {
					trnx.rollback();
				}
			}
			//HibernateUtil.closeSessionFactory();
			//sFactory.close();
		}
	}

}
