package model;

import java.util.ArrayList;

public class Section {

    private int id;
    private ArrayList<Product> products;
    private String description;

    public Section(){

    }

    public Section(int id, ArrayList<Product> products, String description) {
        this.id = id;
        this.products = products;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
    
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
