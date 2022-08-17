package JavaPractice;

public class SwapWith {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println("Before swap x= "+ x + " y="+ y);
        System.out.println("");
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.print("After swap x= "+ x + " y="+ y);
    }
}
