package dao;

import models.Product;

import java.util.List;

public interface Products {
    List<Product> all();
    void  insert(Product product);
}
