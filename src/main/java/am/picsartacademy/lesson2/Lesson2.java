package am.picsartacademy.lesson2;

public class Lesson2 {
    public static void main(String[] args) {

        //version 1 of creating array
        int[] myArray;
        myArray = new int[10];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;
        myArray[5] = 60;
        myArray[6] = 70;
        myArray[7] = 80;
        myArray[8] = 90;
        myArray[9] = 100;

        //version 2 of creating array

        int[] array2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        //version 3

        int[] array3 = new int[100];

        for (int i = 0; i < array3.length; i++) {
            System.out.println("setting value for index " + i + " where value is " + (i + 1));
            array3[i] = i + 1;
            System.out.println(array3[i]);
        }


    }

}




