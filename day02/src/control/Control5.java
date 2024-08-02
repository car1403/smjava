package control;

import java.util.Scanner;

public class Control5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Menu(q,s): ");
            String menu = sc.nextLine();
            if (menu.equals("q")) {
                System.out.println("Goodbye!");
                break;
            }else if(menu.equals("s")){
                System.out.println("Game Start ,,,");
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Input Number:(1~10) ");
                int number = sc2.nextInt();
                System.out.printf("Input Number is %d\n ", number);
                sc2.close();
            }else{
                System.out.println("Invalid Menu Try Again !");
            }
        }
        sc.close();

    }
}
