package JavaPractice;

public class Armstrong {
    public static void main(String[] args) {
        int n= 153;
       int temp=n;
        int p=0;
        while(n>0) {
            int r = n % 10;
            p = (p) + (r * r * r);
            n = n / 10;
        }
                    if (temp==p)
                    {
                        System.out.print("yes, armstrong"); }
                    else {
                        System.out.print("no armstrong");
                    }

    }
}