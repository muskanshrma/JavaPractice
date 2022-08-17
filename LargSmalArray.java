package JavaPractice;

public class LargSmalArray {

    public static void main(String[] args)
    {
        int l,s,i;

        int a[]={2,4,5};
        int n = a.length;
        l=s=a[0];
        for(i=1;i<=n;++i) {
            if (a[i] > l)
                l = a[i];
            if (a[i] < s)
                s = a[i];
        }


        System.out.print("Smallest number is"+ s );


        System.out.print("Largest number is"+ l );

    }
}
