package JavaPractice;

public class EvenOdd50 {
    public static void main(String[] args) {
        int n = 50;
        int i;

        System.out.println("even nos");
        for (i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        System.out.println("odd nos");
        for (i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}



