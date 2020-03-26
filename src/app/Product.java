package app;

public class Product {

    private String name;
    private int quantity;
    private int price;

    public Product(String name, int quantity, int price) {
        super();

        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

}