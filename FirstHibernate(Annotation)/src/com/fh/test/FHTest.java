package com.fh.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.fh.entity.Project;

public class FHTest {

	public static void main(String[] args) {
		Configuration configuration= new Configuration().configure("com\\fh\\cfg\\Hibernate.cfg.xml");
		SessionFactory factory= configuration.buildSessionFactory();
		Session session=factory.openSession();
		Project project=(Project)session.load(Project.class,1467);
		//Project project1=(Project)session.load(Project.class,6896);
		if(project==null)
			System.out.println("Record not found");
		else{
			System.out.println("Record found");
			System.out.println(project);
			//System.out.println(project1);
		}
		
		//close objs
		session.close();
		factory.close(); 
	}//main
}//class