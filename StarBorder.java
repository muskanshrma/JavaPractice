package JavaPractice;

public class StarBorder {
    public static void main(String[] args)
    {
        int i, j;

        for (i = 1; i <= 3; i++)
        {
            System.out.println("*");

            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.print("*");
            System.out.println("");}


            for (i = 2; i >= 1; i--) {
                System.out.print("*");


             for (j=1; j<=1;j++) {
                 System.out.print(j);
                 for (j = i - 1; j >= i; j--) {
                     System.out.print(j);
                 }

                 System.out.print("*");
                 System.out.println();
             }

                System.out.print("*");
            }
        }
    }



