package bank;

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account("1232323", 10000);
        System.out.println(acc1);
        System.out.println(acc1.getBalance());
        acc1.deposit(100);
        System.out.println(acc1.getBalance());
        acc1.withdraw(300000);
        acc1.withdraw(5000);
        System.out.println(acc1.getBalance());

    }
}
