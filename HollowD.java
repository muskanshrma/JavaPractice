package JavaPractice;

public class HollowD {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                System.out.print("*");
                {
                    System.out.print(" ");
                }
                for (k = i; k <= 8; k++) {
                    System.out.print("*");
                    System.out.println("");
                }





            }
        }
    }
}


