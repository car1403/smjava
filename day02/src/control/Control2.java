package control;

import java.util.Scanner;

public class Control2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an 3 Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.printf("Num1 %d, Num2 %d, Num3 %d\n",a,b,c);

        // 최대 값과 최소 값을 출력 하시오
//        int max = 0;
//        int min = 0;
//
//        if(a < b){
//            max = b;
//        }else{
//            max = a;
//        }
//        if(max < c){
//            max = c;
//        }
//
//
//        if(a < b){
//            min = a;
//        }else{
//            min = b;
//        }
//        if(min > c){
//            min = c;
//        }

        int max = (a > b)? a:b;
        max = (max > c)? max:c;

        int min = (a < b)? a:b;
        min = (min > c)? c:min;

        System.out.printf("Max %d, Min %d",max, min);

    }
}





