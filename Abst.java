import java.util.*;
abstract class Bank2 {
    int moneybalance = 10000;
    String Bankname = "ICICI";
    String IFSC = "AHF000";
    private int pin = 000;

    abstract void deposit();

    abstract void withdraw();
}

class Info extends Bank2 {

    void deposit() {
        System.out.println("Enter PIN");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();

        if (pin == 000) {
            System.out.println("Enter deposit money");
            int deposit = sc.nextInt();
            moneybalance = moneybalance + deposit;
            System.out.println("Total balance is " + moneybalance);
        } else System.out.println("Invalid PIN");

    }

    public void withdraw() {
        System.out.println("Enter PIN");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();

        if (pin == 000) {
            System.out.println("Enter withdraw money");
            int withdraw = sc.nextInt();
            moneybalance = moneybalance - withdraw;
            System.out.println("Total balance is " + moneybalance);
        } else System.out.println("Invalid PIN");
    }}

    class Abst {
        public static void main(String[] args) {
            Bank2 obj = new Info();

            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("Enter the Choice");
            Scanner sc = new Scanner(System.in);
            int z = sc.nextInt();
            switch (z) {
                case 1:
                    obj.deposit();
                    break;
                case 2:
                    obj.withdraw();

            }

        }
    }




