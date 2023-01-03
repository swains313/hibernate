package org.hibernate2.project2;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	
    	Student st=new Student();
    	st.setSid(25);
    	st.setSname("hirithik ");
    	st.setSper(67.90);
    	
    	Session ss=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
    	Transaction tr=ss.beginTransaction();
    	
    	
    	ss.save(st);
    	tr.commit();
    	ss.close();
    	System.out.println("Successfully inserted ");
        
    }
}
