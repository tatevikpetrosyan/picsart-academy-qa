package am.picsartacademy.lesson2;

public class Homework1Task3 {
    public static void main(String[] args) {

        int[] secondArray;
        secondArray = new int[20];
        int i = 0;

        for (int j = -20; j < secondArray.length; j++) {

            if (j % 2 != 0) {
                secondArray[i] = j;
                System.out.println(secondArray[i]);
                i++;

            }

        }

    }
}
