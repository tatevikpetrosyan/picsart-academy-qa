package am.picsartacademy.lesson3;

public class Lesson36Method {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = maxValue(array);
        System.out.println(max);

        int min = minValue(array);
        System.out.println(min);

        int[] array2 = {55, 52, 53, 54, 55, 6, 7, 8, 9, 10};
        int max2 = maxValue(array2);
        System.out.println(max2);

        int min2 = minValue(array2);
        System.out.println(min2);



    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}