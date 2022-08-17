package JavaPractice;

public class Leap {
    public static void main(String[] args) {
        int year = 2005;
        if (year % 4 == 0) {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                    System.out.print("YES");
                else System.out.print("No");
            } else System.out.print("No");
        } else System.out.print("No");
    }
    }








