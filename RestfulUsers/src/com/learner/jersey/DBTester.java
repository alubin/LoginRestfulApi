package com.learner.jersey;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTester {

	public static void main(String[] args) {

		DBConnection testConn = new DBConnection();

		try {
			testConn.createConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
