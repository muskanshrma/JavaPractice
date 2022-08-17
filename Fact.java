package JavaPractice;
import java.util.*;
public class Fact {
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);

        int i;
        int fact=1;
        int num=scn.nextInt();

        for (i=1;i<=num;i++) {
            fact = fact * i;
        }
        System.out.print(fact);
    }

}
