package application;

import java.util.Date;

import models.entities.Department;
import models.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Marcos", "Bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(seller);
		
	}

}
