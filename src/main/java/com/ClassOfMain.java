package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClassOfMain {

	public static void main(String[] args) {

		//----------------------------
        SessionFactory sf= new Configuration().configure().buildSessionFactory();        
        // obtains the session
        Session session = sf.openSession();
        session.beginTransaction();
        //--------------------------

	

	Student2 st= new Student2(1,"Ram","pass");
	session.save(st);
	
	Student2 st1= new Student2(2,"Ram","pass");
	session.save(st1);
	
	Student2 st2= new Student2(3,"Ram","pass");
	session.save(st2);
	
	
	
    
    //------------    
    session.getTransaction().commit();
    session.close();
    //-----------------------
	
    }	
     }
