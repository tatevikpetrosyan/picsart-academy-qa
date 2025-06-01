package am.picsartacademy;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        //Array Access with Exception
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an index 0-4");
        try {
            int index = sc.nextInt();
            System.out.println(a[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        sc.nextLine();
        //String to Number Conversion
        System.out.println("enter a number as a string");
        try {
            String numStr = sc.nextLine();
            int numStr2 = Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            System.out.println(e);

        }
    }
}
