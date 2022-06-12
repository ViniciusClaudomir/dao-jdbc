package application;


import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		
		Department dp = new Department(1, "Computers");
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== test 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("==== teste 2: Seller by find Departament");
		System.out.println(sellerDao.findByDepartment(dp).toString());
		System.out.println("==== teste 3: find all");
		List<Seller> listOfSellers = sellerDao.findAll();
		
		for (Seller sellerInterator : listOfSellers) {
			System.out.println(sellerInterator);
		}
		
		System.out.println("===== test 4: insert values ====");
		Seller sellerInsertTest = new Seller(null, "Vinicius", "Vinicius@gmail.com", new Date(), 400.0, dp);
		sellerDao.insert(sellerInsertTest);
		System.out.println(sellerInsertTest.getId());
		
		System.out.println("===== test 5: Update values ====");
		
		seller = sellerDao.findById(1);
		seller.setName("Marcelo");
		sellerDao.update(seller);
		sellerDao.deleteByID(seller.getId());
		
		
		
		
		
		
		
		
		
	}

}
