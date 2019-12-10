package com.energy;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) throws Exception {
	    //Todo write code here
      get_Connection();
    }

    public static Connection get_Connection() throws Exception {
      try {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/energy?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "root";
        String password = "root";
        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Connected");
        return conn;
      } catch (Exception e) {
        System.out.println(e);
      }
      return null;
    }
}
