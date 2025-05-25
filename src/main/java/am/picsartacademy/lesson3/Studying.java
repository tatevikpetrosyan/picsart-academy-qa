package am.picsartacademy.lesson3;

public class Studying {
    public static void main(String[] args) {
        System.out.println("\n ----Print numbers from 1 to 15");

        for(int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n----------Print even nums from -10 to 20-------");

        for (int i = -10; i < 21; i++) {
            if ( i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        //another way
        System.out.println();
        for (int i = -10; i < 21; i+=2) {
                System.out.print(i + " ");
            }

        System.out.println("\n ------Print * using given nums");
        int n = 5;

        //*
        //**
        //***
        //****
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("\n----Create an array 1: 11");
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.println(array[i]);

        }
        System.out.println("\n--- array -10 to 10 even numbers----");
        int[] array2 = new int[21   ];
        int firstValue = -10;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = firstValue;
            firstValue++;
        }
        for (int j = 0; j < array2.length; j++) {
            if (array2[j] % 2 == 0) {
                System.out.print(array2[j] + " ");
            }
            
        }

        System.out.println("\n--- print multiplication of an array----");
        int[] array3 = {4,5,2,7,1,3,8,12,24,15};
        int m = 1;
        for (int i = 0; i < array3.length; i++) {
            m = m * array3[i];
        }
        System.out.print(m + " ");

        System.out.println("\n--- count of As in a given string----");
        String[] array4 = {"A", "B", "a", "A", "AAAA"};
        int count = 0;
        for (int i = 0; i < array4.length; i++) {
            if(array4[i].equals("A")) {
                System.out.println(array4[i]);
                count++;
            }

        }
        System.out.println(count);

        System.out.println("-----------");
        int num = 8;
        if (num % 2 == 0) {
            System.out.println("it is even");
        } else {
            System.out.println("it is odd");
        }

        int num1 = 4;
        int sum = 0;
        for (int i = 1; i <= num1 ; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        for (int i = 1; i <= 20 ; i++) {
            if ( i % 3 == 0 && i % 5 ==0 ) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }

        num1 = 4;
        sum = 0;
        int i = 1;
        while (i <= num1) {
            sum = sum + i;
            i ++;
        }
        System.out.println(sum); // Should print 10



    }
    }

