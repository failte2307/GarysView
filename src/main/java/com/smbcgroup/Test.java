package com.smbcgroup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Test {


		public static void main(String[] args) {
			
		
			
			
			String jdbcUrl = "jdbc:mysql://sql2.freesqldatabase.com/sql2289258";
			String user= "sql2289258";
			String pass = "bP8*fT5%";
			
			try {
				
				Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
				
				
				Statement stmt = myConn.createStatement();
			
				ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
				
				while(rs.next()) {
					System.out.print("\nEmployee ID: ");
				    System.out.print(rs.getString("Employee_Id"));
				    System.out.print("\nDepartment ID: ");
				    System.out.print(rs.getString("Department_Id"));
				    System.out.print("\nName : ");
				    System.out.print(rs.getString("Employee_Name"));
				    System.out.print("\nTelephoneNumber : ");
				    System.out.print(rs.getString("Tel_Number"));
				    System.out.print("\nEmail: ");
				    System.out.print(rs.getString("E_Mail"));
				}
				
				
				
			}
			catch(Exception exc){
				exc.printStackTrace();
			}

		}

	}

