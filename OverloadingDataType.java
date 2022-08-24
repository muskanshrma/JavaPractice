public class OverloadingDataType {
    String species;
    int age;
    public static void eat(int a) {
        System.out.println("2");
    }
    public static void eat(String s) {

        System.out.println("printing string ");
    }
    public static void eat(double c) {
        System.out.println("printing double");
    }
    public static void main(String[] args) {
      eat(1);
      eat("g");
        eat(1.1);


    }
    }

