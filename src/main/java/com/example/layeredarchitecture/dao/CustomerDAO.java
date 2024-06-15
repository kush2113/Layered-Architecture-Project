package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {

    public ArrayList<CustomerDTO> getALlCustomer() throws SQLException, ClassNotFoundException;

    public  void save(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
    public void update(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
    public void Delete(String id) throws SQLException, ClassNotFoundException;
    public String generateId() throws SQLException, ClassNotFoundException;
    public boolean exist(String id) throws SQLException, ClassNotFoundException;

    public CustomerDTO findCustomer(String newValue) throws SQLException, ClassNotFoundException ;

}
