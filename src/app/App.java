package app;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> products = new ArrayList<Product>();
        Cart cart = new Cart(products);

        products.add(new Product("Beans", 2, 200));

        int netTotal = cart.CalculateNetTotal();

        System.out.printf("Net Total: %d\n", netTotal);

    }
}