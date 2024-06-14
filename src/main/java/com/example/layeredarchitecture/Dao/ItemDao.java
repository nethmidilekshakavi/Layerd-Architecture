package com.example.layeredarchitecture.Dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDao {
    public ArrayList<ItemDTO> getallItems() throws SQLException, ClassNotFoundException;

    public void saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    public void updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    public void deleteItem(String code) throws SQLException, ClassNotFoundException;

    public boolean existItem(String code) throws SQLException, ClassNotFoundException;

    public void findItem(String code) throws SQLException, ClassNotFoundException;


}