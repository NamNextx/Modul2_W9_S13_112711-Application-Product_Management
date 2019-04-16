package service;

import model.Product;

import java.util.List;

public interface IProductManagement {
    List<Product> findAll();
    void save(Product product);
    Product findByNameProduct(String nameProduct);
    void update(int id,Product product);
    void remove(int id);


    Product findByID(int id);
}
