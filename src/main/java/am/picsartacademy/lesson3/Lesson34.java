package am.picsartacademy.lesson3;

import java.util.Scanner;

//burg with nested loops

public class Lesson34 {
    public static void main(String[] args) {
        System.out.println("Enter array size:");

        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter array " + i + " element:");
            array[i] = scanner.nextInt();

        }



        int day = 3;

      switch (day) {
           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
          default:
              System.out.println("nothing");

       }
        }

        }












