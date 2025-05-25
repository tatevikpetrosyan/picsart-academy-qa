package am.picsartacademy.lesson3;

//burg with nested loops

public class Lesson33 {
    public static void main(String[] args) {
       int n = 15;
        for (int i = 0; i < n; i++) {
            if (i % 2 !=0) {
                for (int j = 0; j < (n - i) / 2; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print("*");

                }
                System.out.println();
        }

        }

        }
    }




       /*
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
        for (int num : array) {
            System.out.println(num + "");
        }

        temp = array[5];
        array[5] = array[4];
        array[4] = temp;

        for (int num : array) {
            System.out.println(num + "");
        }

        } */





