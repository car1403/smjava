package bank;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Account {
    private String accNumber;
    private double balance;

    public Account(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount <= 0){
            System.out.println("You can't deposit negative amount");
            return;
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= 0){
            System.out.println("You can't withdraw negative amount");
            return;
        }
        if(amount > this.balance){
            System.out.println("You can't withdraw more than balance");
            return;
        }
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNumber='" + accNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
