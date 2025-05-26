package am.picsartacademy.onlineShopping;

import am.picsartacademy.onlineShopping.models.Customer;
import am.picsartacademy.onlineShopping.models.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("iPhone15");
        product1.setPrice(1000);
        product1.setQuantity(5);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("iPhone12");
        product2.setPrice(800);
        product2.setQuantity(0);

        Product[] products = {product1, product2};

        Customer.addToCart(2, products);

    }
}
