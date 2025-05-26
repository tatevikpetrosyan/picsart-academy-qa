package am.picsartacademy.onlineShopping.models;

public class Admin extends User {

    public Admin(String type) {
        super("Admin");
    }

    @Override
    public String getRole() {
        return "Admin";
    }
    public static void addProduct(int productId) {
        System.out.println("Product with the id " + productId+ " added");
    }
    public static void deleteProduct(int productId) {
        System.out.println("Product with the id " + productId+ " added");
    }
}
