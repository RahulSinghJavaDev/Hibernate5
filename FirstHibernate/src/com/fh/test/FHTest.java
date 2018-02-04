package com.fh.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaValidator;

import com.fh.entity.Project;

public class FHTest {

	public static void main(String[] args) {
		Project project= null;
		SessionFactory factory= null;
		Session session=null;
		Configuration configuration=null;
		
	   configuration= new Configuration().configure();
		
	   //schemaValidator tool test
		
	   /*SchemaValidator validator= new SchemaValidator(configuration);
		validator.validate();*/
		
		
	    factory= configuration.buildSessionFactory();
		session=factory.openSession();
		
		 project=(Project)session.load(Project.class,5996);
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