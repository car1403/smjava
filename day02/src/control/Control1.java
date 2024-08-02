package control;

import java.util.Random;
import java.util.Scanner;

public class Control1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        if(num < 1 || num > 10 ){
            System.out.println("Invalid number");
            sc.close();
            return;
        }
        System.out.printf("Enter an integer: %d\n",num);
        Random r = new Random();
        int num2 = r.nextInt(10)+1;

        if(num > num2){
            System.out.printf("Number is greater than number %d\n",num2);
        }else if(num == num2){
            System.out.printf("Number is equal %d\n",num2);
        }else{
            System.out.printf("Number is less than number %d\n",num2);
        }

        sc.close();
    }


}
