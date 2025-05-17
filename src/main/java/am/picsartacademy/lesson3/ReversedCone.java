package am.picsartacademy.lesson3;

public class ReversedCone {
    public static void main(String[] args) {
        
        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 *(n-i))-1; k++) {
                System.out.print("+");
                
            }
            System.out.println();
        }
    }
}
