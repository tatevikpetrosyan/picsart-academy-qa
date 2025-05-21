package am.picsartacademy.homeworkOOP;

import am.picsartacademy.homeworkOOP.models.Smartphone;
import am.picsartacademy.homeworkOOP.models.iPhone;

public class Working2 {
    public static void main(String[] args) {
        Smartphone iphone15 = new Smartphone(3, true);
        iphone15.updateApps();

        System.out.println("--------");
        Smartphone iphone16 = new iPhone(true);
        iphone16.updateApps();

        System.out.println("--------");
        iPhone iPhone14 = new iPhone(true);
        iPhone14.checkSize("max");
        iPhone14.checkSize("max", "pro");
    }

}
