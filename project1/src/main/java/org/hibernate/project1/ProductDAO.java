package org.hibernate.project1;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductDAO {
	
	static Scanner sc;
	static Session ss;
	
	static {
		sc=new Scanner(System.in);
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		ss=sf.openSession();
	}

	public void insertProduct() {
		ProductDTO p=new ProductDTO();
		System.out.println("Enter the PID_PNAME_PPRICE ");
		
		
		Transaction tr=ss.beginTransaction();
		try {
			p.setPid(sc.nextInt());
			p.setPname(sc.next());
			p.setPprice(sc.nextDouble());
			ss.save(p);
			tr.commit();
		}catch(InputMismatchException e)
		{
			System.out.println("!!! INVALID !!! ");
			return;
		}
		System.out.println("Successfully Inserted ");
		
	}

	public void updateProduct() {
		try {
			System.out.println("Enter the pid for update ");
			Integer pid=sc.nextInt();
			ProductDTO prd=(ProductDTO)ss.load(ProductDTO.class, pid);
			prd.setPname(sc.next());
			prd.setPprice(sc.nextDouble());
			Transaction tr=ss.beginTransaction();
			tr.commit();
		}catch(Exception e)
		{
			System.out.println("Plz enter valid ID ");
			return;
		}System.out.println("Successfully inserted ");
		
	}

	public void readProduct() {
	try {
		System.out.println("Enter the pid for read ");
		Integer pid=sc.nextInt();
		
		ProductDTO prd=(ProductDTO)ss.get(ProductDTO.class, pid);
		System.out.println("pid : "+prd.getPid());
		System.out.println("pname : "+prd.getPname());
		System.out.println("pprice : "+prd.getPprice());
	}catch(Exception e)
	{
		System.out.println("PId not exist Enter the valid id ");
		return;
	}
	}

	public void deleteProduct() {
		try
		{
			System.out.println("Enter the pid for delete ");
			Integer pid=sc.nextInt();
			ProductDTO prd=(ProductDTO)ss.load(ProductDTO.class, pid);
			ss.delete(prd);
			Transaction tr=ss.beginTransaction();
			tr.commit();
		}catch(Exception e)
		{
			System.out.println("PID not exit enter Valid PID ");
			return;
		}
		System.out.println("Succesfully Deleted ");
		
	}

	public void exitProduct(int i) {
		System.exit(i);
		sc.close();
		ss.close();
		
	}
	
	

}
