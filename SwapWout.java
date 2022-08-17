package JavaPractice;

public class SwapWout {
    public static void main(String[] args) {
        int x= 20;
        int y = 50;
        int t;
        System.out.println("Before swap x= "+ x + " y="+ y);
        System.out.println("");
        t=x;
        x=y;
        y=t;
        System.out.print("After swap x= "+ x + " y="+ y);
    }
}
