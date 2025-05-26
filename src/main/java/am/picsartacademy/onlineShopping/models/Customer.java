package am.picsartacademy.onlineShopping.models;

public class Customer extends User {

    public Customer(String type) {
        super("Customer");
    }

    @Override
    public String getRole() {
        return "Customer";
    }

    //check the availability of product
    public static void addToCart(int prId, Product[] products) {
        for (Product p : products) {
            if (p.getId() == prId) {
                if (p.getQuantity() > 0) {
                    System.out.println("Added");
                    p.setQuantity(p.getQuantity() - 1);
                } else {
                    System.out.println("Out of stock");
                }
                break;
            }

        }

    }
}
