public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount");
        } else {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Funds");
        } else {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}