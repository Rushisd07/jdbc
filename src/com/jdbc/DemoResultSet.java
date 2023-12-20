package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.GetMySQLConnection;

public class DemoResultSet {

	public static void main(String[] args) {
		Connection conn;
		PreparedStatement prp;
		ResultSet rs;
		//String qry= "select * from employee";
		String qry="select * from employee where empid=?";
		conn=GetMySQLConnection.getMyConnection();
		try {
			prp= conn.prepareStatement(qry);
			//set the in parameter of the query
			prp.setInt(1,9);
			rs= prp.executeQuery();
			//while(rs.next())
				//System.out.println("emp id & name "+ rs.getInt(1)+ " "+rs.getString("empname"));
		if(rs.next())
			System.out.println("record existing "+ rs.getString(2));
		else
			System.out.println("no such id exits ");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
	}
	}