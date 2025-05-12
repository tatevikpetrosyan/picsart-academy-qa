package am.picsartacademy.lesson2;

public class Homework2Task6 {
    public static void main(String[] args) {

        int[] myArray = {1,5,8,10,36,58,74,122,58,30,10,0,-20,51,11};
        int count = 0;

        for (int i = 0; i < 15; i ++) {
            if (myArray[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

