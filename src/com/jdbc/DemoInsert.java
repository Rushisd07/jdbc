package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DemoInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//jdbc program to insert data into the database
		Connection conn;	//hold the database connection
		Statement st;
		String qry = "Insert into employee values(5,'Hibernet')";
		MysqlDataSource ds = new MysqlDataSource();
		
		ds.setUser("root");
		ds.setPassword("root");
		ds.setServerName("localhost");
		ds.setPortNumber(3306);
		ds.setDatabaseName("rushi");
		
		//get the connection
		
		try {
			conn = ds.getConnection();
			//create a statement type object
			st = conn.createStatement();
			int row = st.executeUpdate(qry);//firing query
			if(row>0)
				System.out.println("Success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
