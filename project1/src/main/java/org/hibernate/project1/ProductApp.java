package org.hibernate.project1;

import java.util.Scanner;

public class ProductApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ProductDAO prd=new ProductDAO();
		
		while(true)
		{
			
			System.out.println("1.for insert \n 2.for update \n 3.for read \n 4.for delete \n 5.for exit ");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:
			{
				prd.insertProduct();
			}break;
			case 2:
			{
				prd.updateProduct();
			}break;
			case 3:
			{
				prd.readProduct();
			}break;
			case 4:
			{
				prd.deleteProduct();
			}break;
			case 5:
			{
				System.out.println("EXIT");
				prd.exitProduct(0);
				sc.close();
			}break;
			default:
				System.out.println("You Entered Wrong choice!!!");
			}
			
		}
		
		
		
	}

}
