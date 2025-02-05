package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import db.DB;
import db.DbException;
import model.dao.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obk = new Department(1, "livros");
		
		SelllerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = new Seller(32, "Rubens", "teste@teste.com", new Date(), 3000.0, obk);
		System.out.println(seller);
	}
}