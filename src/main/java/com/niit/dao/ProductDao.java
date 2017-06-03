package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDao {public boolean saveorupdate(Product product);

public boolean delete(Product product);

public Product get(String id);

public List<Product> list();


}
