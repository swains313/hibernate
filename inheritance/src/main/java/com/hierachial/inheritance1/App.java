package com.hierachial.inheritance1;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        PEmployee pemp=new PEmployee();
        pemp.setEid(123);
        pemp.setEname("saumyaranajn");
        pemp.setEsal(80000.0);
        
        
        CEmployee cemp=new CEmployee();
        cemp.setEid(125);
        cemp.setEname("uditanupam");
        cemp.setHrate(50000.0);
        
        Session ss=new Configuration().configure().buildSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        ss.save(pemp);
        ss.save(cemp);
        tr.commit();
        ss.close();
        System.out.println("Successfully inserted ");
        
        
        
        
        
        
    }
}
