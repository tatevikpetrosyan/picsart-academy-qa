package am.picsartacademy.lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        int[] array = {8, 1, 6, 4, 9, 2};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max + "search bubble sorting");
    }
}

