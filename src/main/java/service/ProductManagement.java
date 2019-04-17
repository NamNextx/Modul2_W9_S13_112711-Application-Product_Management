package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductManagement implements IProductManagement {
    private static Map<Integer,Product> productMap=new HashMap<>();
    static {
        productMap.put(1,new Product(1,"Pen thien long",3000,"Box of 96 count #2 HB yellow, wood-cased pencils with latex-free eraser - certified non-toxic. ","Thien Long"));
        productMap.put(2,new Product(2,"Cup of tea",12000,"QUANTITY: 10 Piece Set (1 Bride & 9 Pink Bride Tribe)","Vin group"));
        productMap.put(3,new Product(3,"Adapter",210000,"Charge for battery","Bee"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
            productMap.put(product.getId(),product);
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
            productMap.remove(id);
    }

    @Override
    public Product findByID(int id) {
            return productMap.get(id);
    }
}
