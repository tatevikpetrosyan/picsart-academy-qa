package am.picsartacademy.oop3;

public class Cow implements Animal {
    static int currentYear;

    @Override
    public void eat() {
        System.out.println("Cow eats");
    }

    @Override
    public void sleep() {
        System.out.println("Cow sleeps") ;
    }

    @Override
    public int getAge() {
        return 5;
    }
}
