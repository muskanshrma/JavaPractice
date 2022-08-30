
import java.util.Scanner;
class BankE {
    private int moneybalance = 10000;
    private int pin = 000;

    public void deposit() {
        System.out.println("Enter PIN");
        Scanner sc = new Scanner(System.in);
        pin = sc.nextInt();

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
        pin = sc.nextInt();

        if (pin == 000) {
            System.out.println("Enter withdraw money");
            int withdraw = sc.nextInt();
            moneybalance = moneybalance - withdraw;
            System.out.println("Total balance is " + moneybalance);
        } else System.out.println("Invalid PIN");
    }
}

      public class Encap
    {
        public static void main (String[] args)
        {
            BankE info = new BankE();

        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("Enter the Choice");
        Scanner sc = new Scanner(System.in);
        int z=sc.nextInt();
        switch(z) {
            case 1:
                info.deposit();
                break;
            case 2:
                info.withdraw();

        }

        }
    }