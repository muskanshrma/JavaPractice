package JavaPractice;

public class Pascal {
    public static void main(String[] args) {

        int i, j, k;

        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            int t = 1;
            for (k = 1; k <= i; k++) {
                System.out.print(t + " ");
                t = t * (i - k) / k;
                System.out.println("");
            }
        }
    }
}
