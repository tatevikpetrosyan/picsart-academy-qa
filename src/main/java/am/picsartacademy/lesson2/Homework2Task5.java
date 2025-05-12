package am.picsartacademy.lesson2;

public class Homework2Task5 {
    public static void main(String[] args) {

        double[] myArray = new double[45000];
        int i = 0;

        for (double j = 24.12; j < 467.23; j = j + 0.01 ) {
            myArray[i] = j;

            System.out.printf("%.2f\n", myArray[i]);
            i++;
        }
    }
}

