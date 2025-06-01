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
        if (name.length() > 20) {
            throw new NameException("Name field should be 20digits long");
        } else {
            this.name = name;
        }
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



