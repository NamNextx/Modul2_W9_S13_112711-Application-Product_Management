package model;

public class Product {
    private int id;
    private String product_Name;
    private int product_Price;
    private String product_Description;
    private String product_Supplier;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public int getProduct_Price() {
        return product_Price;
    }

    public void setProduct_Price(int product_Price) {
        this.product_Price = product_Price;
    }

    public String getProduct_Description() {
        return product_Description;
    }

    public void setProduct_Description(String product_Description) {
        this.product_Description = product_Description;
    }

    public String getProduct_Supplier() {
        return product_Supplier;
    }

    public void setProduct_Supplier(String product_Supplier) {
        this.product_Supplier = product_Supplier;
    }
}
