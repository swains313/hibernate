package org.project.inheritance1;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Employee e=new Employee();
        e.setEid(12);
        e.setEname("bishnu");
        
        PEmployee p=new PEmployee();
        p.setEid(34);
        p.setEname("sanjay");
        p.setEsal(78.9);
        
        
        CEmployee c=new CEmployee();
        c.setEid(67);
        c.setEname("raghav");
        c.setHrate(800.0);
        
        
        Session ss=new Configuration().configure().buildSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.save(e);
        ss.save(p);
        ss.save(c);
        tr.commit();
        ss.close();
        System.out.println("Successfully");
        
 
    }
}
