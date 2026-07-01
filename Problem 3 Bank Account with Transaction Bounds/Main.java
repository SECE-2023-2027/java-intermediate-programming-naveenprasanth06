import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, name, balance);

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();

        account.deposit(deposit);

        System.out.print("Enter Withdraw Amount: ");
        double withdraw = sc.nextDouble();

        account.withdraw(withdraw);

        System.out.println("Current Balance: " + account.getBalance());

        sc.close();
    }
}