package am.picsartacademy.lesson2;

public class Homework2Task4 {
    public static void main(String[] args) {

        int[] myArray;
        myArray = new int[100];

        for (int i = 0; i < 100; i++) {
            myArray[i] = i + 1;
        }

        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] % 5 == 0) {
                System.out.println(myArray[j]);
            }
        }
    }
}

