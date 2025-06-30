package day3;

public class Bankdetails {
    private double balance;

    public Bankdetails(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + this.balance);
        } else if(amount <= 0){
            System.out.println("Invalid withdrawal amount.");
        }
         else {
            System.out.println("Insufficient funds.");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        Bankdetails account = new Bankdetails(1000);
        System.out.println("Initial balance: $" + account.getBalance());

        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500);
    }
}