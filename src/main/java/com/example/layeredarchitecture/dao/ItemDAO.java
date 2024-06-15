package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {

    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;
    public void save(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
    public void update(String description, BigDecimal unitPrice, int qtyOnHand, String code) throws SQLException, ClassNotFoundException;
    public boolean exist(String code) throws SQLException, ClassNotFoundException;
    public String generateId() throws SQLException, ClassNotFoundException;
    public void delete(String code) throws SQLException, ClassNotFoundException;

    ItemDTO findItem(String newItemCode) throws SQLException, ClassNotFoundException;
}
