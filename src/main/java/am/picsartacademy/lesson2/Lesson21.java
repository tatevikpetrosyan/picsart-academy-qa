package am.picsartacademy.lesson2;

public class Lesson21 {
    public static void main(String[] args) {

        // separate even numbers
        int[] array4 = new int[10];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = i + 1;
            System.out.println(array4[i]);
        }

        for (int j = 0; j < array4.length; j++) {
            if (array4[j] % 2 == 0) {
                System.out.println(array4[j]);
            } else {
                System.out.println("not even");
            }
        }
    }
}
