package am.picsartacademy;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your number");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        //2
        System.out.println("-----");
        System.out.println("write a number");
        int num1 = scanner.nextInt();
        if (num1 % 2 ==0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

        //3
        System.out.println("-----");
        System.out.println("write a year");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)) {
            System.out.println("leap year");
        }else {
            System.out.println("not a leap year");
        }

        //4
        System.out.println("-----");
        System.out.println("write a 3 numbers");
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        if (num2 > num3 && num2 > num4) {
            System.out.println(num2);
        } else if (num3>num2 && num3 >num4) {
            System.out.println(num3);
        } else {
            System.out.println(num4);
        }

        //5
        System.out.println("-----");
        System.out.println("write a grade");
        int num7 = scanner.nextInt();
        if (num7 >=90 && num7 <=100) {
            System.out.println("A");
        }else if (num7>=80 && num7<=89) {
            System.out.println("B");
        }else if (num7>=70 && num7<=79) {
            System.out.println("C");
        }else if (num7>=60 && num7<=69) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }


    }
}
