package com.example.layeredarchitecture.Dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderDAOImpl {

       public String generateNewOrderIds() throws SQLException, ClassNotFoundException {
           Connection connection = DBConnection.getDbConnection().getConnection();
           Statement stm = connection.createStatement();
           ResultSet rst = stm.executeQuery("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");

           if (rst.next()) {
               String lastOrderId = rst.getString("oid");
               int nextId = Integer.parseInt(lastOrderId.replace("OID-", "")) + 1;
               return String.format("OID-%03d", nextId);
           }
           return "OID-001";
       }
   }


