package JavaPractice;

public class Prime {
    public static void main(String[] args) {
        int num=17;
        int c = 0;
        int i;
        for (i = 1; i <= num; i++) {
            if (num % i == 0)
            {
                c++;
            }
        }
        if(c==2) {
            System.out.print("Prime number");
        }else
        {System.out.print("Not prime");}
    }


    }

