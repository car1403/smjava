import java.util.Scanner;

public class Hello2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
//        System.out.println("Result:"+str);
        System.out.printf("입력받은 값은 %s 입니다.\n",str);
        System.out.printf("입력받은 값은 %s 입니다.\n",str);
        sc.close();
    }
}
