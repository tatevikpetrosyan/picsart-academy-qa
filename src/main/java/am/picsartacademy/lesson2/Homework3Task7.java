package am.picsartacademy.lesson2;

public class Homework3Task7 {
    public static void main(String[] args) {

        int n = 9;

        if (n > 0 && n < 21) {
            for (int i = 1; i < 11; i++) {
                int result = n * i;
                System.out.println(n +"x" + i + " = " + result);

            }
            } else {
            System.out.println("It is out of range");

        }
    }
}

