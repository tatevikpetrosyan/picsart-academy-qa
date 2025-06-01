package am.picsartacademy.oop;

import am.picsartacademy.oop.exceptions.AgeException;
import am.picsartacademy.oop.exceptions.InvalidNameException;
import am.picsartacademy.oop.models.Human1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int n = x/y;
            System.out.println(n);
        }
        catch (ArithmeticException e) {
            System.out.println(e);

        }
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
        }

        System.out.println("what is your name?");
        String firstName = scanner.nextLine();
        Human1 human1 = new Human1();
        try {
            human1.setFirstName(firstName);
        }

        catch (InvalidNameException e) {
            System.out.println(e.toString());
            System.out.println("Setting default name John");
            human1.setFirstName("John");
        }


        int age = 0;
        try {
            human1.setAge(age);
            System.out.println(human1.age);
        } catch (AgeException e) {
            System.out.println(e.toString());
            System.out.println("Defaulting to age 20");
            human1.setAge(20);
        } finally {
            System.out.println("Finally the age is " + human1.age);
        }
        System.out.println(human1.age);

        scanner.close();
    }
}
