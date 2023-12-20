package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;

import com.util.GetMySQLConnection;

public class DemoPrpStat {

	public static void main(String[] args) {
		Connection conn; //hold the Database Connection
		String qry="insert into employee values(?,?)";
        PreparedStatement prp;
        conn=GetMySQLConnection.getMyConnection();
        try {
			prp=conn.prepareStatement(qry);
			prp.setInt(1,Integer.parseInt(args[0]));
			prp.setString(2,args[1]);
			//execute query
			int row=prp.executeUpdate();
			if (row>0)
				System.out.println("Success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
