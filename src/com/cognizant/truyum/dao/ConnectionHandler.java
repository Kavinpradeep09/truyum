package com.cognizant.truyum.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionHandler {
  public static Connection getConnection() {
    Properties properties = new Properties();
    Connection conn = null;
    try {
      properties.load(ConnectionHandler.class.getResourceAsStream("connection.properties"));
      conn = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),
          properties.getProperty("password"));
    } catch (SQLException | IOException e) {
      e.printStackTrace();
    }
  return conn;
}
}
 
    