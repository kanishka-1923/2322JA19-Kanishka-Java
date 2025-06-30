package day6;

public class Multithreadbank {
	class Bank {
	    int balance = 100;

	    // Synchronized method to prevent overdrawing
	    synchronized void withdraw(int amount) {
	        String name = Thread.currentThread().getName();
	        System.out.println(name + " wants to withdraw $" + amount);

	        if (balance >= amount) {
	            System.out.println(name + " is processing...");
	            try {
	                Thread.sleep(1000); // simulate delay
	            } catch (InterruptedException e) {
	                System.out.println("Interrupted");
	            }
	            balance -= amount;
	            System.out.println(name + " completed withdrawal. Balance: $" + balance);
	        } else {
	            System.out.println(name + " failed: Not enough balance ($" + balance + ")");
	        }
	    }
	}

	class User extends Thread {
	    Bank bank;
	    int amount;

	    User(Bank bank, int amount, String name) {
	        super(name);
	        this.bank = bank;
	        this.amount = amount;
	    }

	    public void run() {
	        bank.withdraw(amount);
	    }
	}

	    public static void main(String[] args) {
	        Bank b = new Bank();

	        // Creating threads
	        User u1 = new User(b, 60, "User-1");
	        User u2 = new User(b, 50, "User-2");
	        User u3 = new User(b, 30, "User-3");

	        u1.start();
	        u2.start();
	        u3.start();
	    }
	}


