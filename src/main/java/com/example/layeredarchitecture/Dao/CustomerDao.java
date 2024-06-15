package com.example.layeredarchitecture.Dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDao {
    public  boolean isExixt(String id) throws SQLException, ClassNotFoundException ;

    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException ;


    public boolean saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

    public  boolean updateCustomer( CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException ;

    public String genarateId() throws SQLException, ClassNotFoundException ;

    public CustomerDTO getCustomer(String newValue) throws SQLException, ClassNotFoundException ;


    ArrayList<String> loadallCustomerID() throws SQLException, ClassNotFoundException;

    boolean exitCustomer(String id) throws SQLException, ClassNotFoundException;

    CustomerDTO serchCustomer(String newValue) throws SQLException, ClassNotFoundException;

    String  lastId() throws SQLException, ClassNotFoundException;
}
