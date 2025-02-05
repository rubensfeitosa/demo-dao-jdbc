package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Department obk = new Department(1, "livros");
		System.out.println(obk);
	}
}