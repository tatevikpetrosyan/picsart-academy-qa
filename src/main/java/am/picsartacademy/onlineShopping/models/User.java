package am.picsartacademy.onlineShopping.models;

public abstract class User {
    private String name;
    private String email;
    private String type;

    public User (String type){
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract String getRole();

}



