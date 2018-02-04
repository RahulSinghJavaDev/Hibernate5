package com.ht.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;

import com.ht.entity.Task;

public class HTTest {

	public static void main(String[] args) {
		Configuration configuration= new Configuration().configure();
		//programmatic approach to use hb tool for generating db tables
		/*SchemaExport export= new SchemaExport(configuration);
		//export.create(true, true); 
		export.execute(true, true, false, false);
		*/
		//for updating table
		SchemaUpdate update= new SchemaUpdate(configuration);
		update.execute(true, true);
		
		/*SessionFactory sFactory= configuration.buildSessionFactory();
		Session session= sFactory.openSession();
		//Task task=(Task)session.get(Task.class, 1);
		session.close();
		sFactory.close();*/
	}

}
