package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductManagement implements IProductManagement {
    private static Map<Integer,Product> productMap=new HashMap<>();
    static {
        productMap.put(1,new Product(1,"Pen thien long",3000,"But ngoi nho, viet dep","Thien Long"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public Product findByNameProduct(String nameProduct) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }
}
