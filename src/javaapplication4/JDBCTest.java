/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.sql.*;
import static java.lang.Math.abs;
import java.util.Properties;

/**
 *
 * @author Marrko
 */
public class JDBCTest {
  public static void main(String[] args) throws Exception {
    Connection conn = null;
    Properties connections = new Properties();
    connections.put("user", "tommy");
    connections.put("password", "tommy");
    abs(34534);
    try {
      conn = DriverManager.getConnection("jdbc:derby://localhost:1527/training", connections);
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    if (conn != null) {
      //String query = "select * from TOMMY.TEST1 WHERE names=?";
      String query = "select * from TOMMY.TEST1";
      Statement st = conn.createStatement();
      //st.setString(1, "Joy");
      ResultSet rs = st.executeQuery(query);
      while (rs.next()) {
        String names = rs.getString("names");
        System.out.println("My name is: " + names);
      }
      st.close();
      conn.close();
    } else {
      System.out.println("You don goofed.");
    }
  }
  
  
}
