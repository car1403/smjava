package array;

import java.util.Random;

public class Arr4 {
    public static void main(String[] args) {
        // 4행 4열의 배열에 1~100까지의 숫자를 생성하고
        int[][] a =  new int[4][4];
        // 3행 3열에 1~10까지의 랜덤한 숫자를 입력 하고
        Random r = new Random();
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                int num = r.nextInt(100)+1;
                a[i][j]  = num;
            }
        }
        for(int arr[]:a){
            for(int num:arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        // 배열의 대각선에 위치한 숫자들의 합을 구하시오
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(i == j){
                    sum += a[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}
