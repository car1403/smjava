package bank;

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

    public void deposit(double amount) throws Exception {
        if(amount <= 0){
            throw new Exception("You can't deposit negative amount");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if(amount <= 0){
            throw new Exception("You can't withdraw negative amount");
        }
        if(amount > this.balance){
            throw new Exception("Insufficient balance");
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
