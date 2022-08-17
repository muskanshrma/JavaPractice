package JavaPractice;

public class StarPattern {

    public static void main(String[] args) {
        int i, j;
        for (i = 0; i <= 4; i++) {
            for (j = 0; j <= 4; j++)
            {
                {
                    if (j == 0 || j == 4 || (i == j && i <= 2) || (i + j == 4 & i <= 2))
                        System.out.print("*   ");
                    else {
                        System.out.print(" ");
                        System.out.println();
                    }
                }
            }
        }
    }
}







