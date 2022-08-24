public class OverloadingPara {
        String species;
        int age;
        public static void eat(int a) {
            System.out.println("printing " +a);
        }
        public static void eat(int a, int b) {

            System.out.println("printing " +a+" and " +b);
        }
        public static void eat(int a, int b, int c) {
            System.out.println("printing " +a+" and " +b+ " and "+c);
        }
        public static void main(String[] args) {
            eat(1);
            eat(2,5);
            eat(3,65,8);


        }
    }

