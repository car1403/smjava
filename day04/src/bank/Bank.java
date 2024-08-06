package bank;

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account("1232323", 10000);
        System.out.println(acc1);
        try {
            acc1.withdraw(15000);
            System.out.println("정상처리 되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
