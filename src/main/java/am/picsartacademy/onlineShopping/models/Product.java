package am.picsartacademy.onlineShopping.models;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }


}
