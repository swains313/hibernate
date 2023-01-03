package com.project.compositeKey;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertApp
{
    public static void main( String[] args )
    {
        Session ss=new Configuration().configure().buildSessionFactory().openSession();
        Transaction tr=ss.beginTransaction();
        
        Product p=new Product();
        p.setCname("oneplus");
        p.setPname("nord");
        p.setPrice(42000);
        
        ss.save(p);
        tr.commit();
        ss.close();
        System.out.println("Successfyully");
    }
}
