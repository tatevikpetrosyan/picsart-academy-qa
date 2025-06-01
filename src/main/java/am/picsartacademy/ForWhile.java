package am.picsartacademy;

import java.util.Scanner;

public class ForWhile {
    public static void main(String[] args) {
        //1
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }

        //2
        System.out.println();
        System.out.println("------");
        int a = 1;
        while (a <= 50) {
            if(a % 2 == 0){
                System.out.print(a + " ");
            }
            a++;
        }

        //3
        System.out.println();
        System.out.println("------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        //4
        System.out.println();
        System.out.println("------");
        System.out.println("pls write a number");
        int num1 = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= num1; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial is: " + fact);

        //5
        System.out.println();
        System.out.println("---------");
        System.out.println("Write again a number");
        int num2 = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            int result = num2 * i;
            System.out.println(num2 + " x " + i + " = " + result);
        }

    }
}
