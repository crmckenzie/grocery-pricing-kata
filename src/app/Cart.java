package app;

import java.util.List;

public class Cart {

    private List<Product> products;

    public Cart(List<Product> products) {
        super();
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public int CalculateNetTotal() {
        return -1;
    }

}