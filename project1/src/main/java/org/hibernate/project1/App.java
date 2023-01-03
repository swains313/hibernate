package org.hibernate.project1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Student st=new Student();
       st.setId(18);
       st.setName("abhsmita");
       st.setPer(67.7);
       
       Configuration cfg=new Configuration();
       cfg.configure();
       
       SessionFactory sf=cfg.buildSessionFactory();
       Session ss=sf.openSession();
       Transaction tr=ss.beginTransaction();
       ss.save(st);
       tr.commit();
       ss.close();
       sf.close();
       System.out.println("SUCCESSFULLY INSERTED");
    }
}
