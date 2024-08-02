package array;

import java.util.Random;

public class Arr3 {
    public static void main(String[] args) {
        int[][] a =  new int[5][5];

        // 3행 3열에 1~10까지의 랜덤한 숫자를 입력 하고
        Random r = new Random();
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                int num = r.nextInt(10)+1;
                a[i][j]  = num;
            }
        }
        // 전체 배열 값을 출력 하시오
        for(int arr[]:a){
            for(int num:arr){
                System.out.print(num+" ");
            }
            System.out.println();
        }

    }

}
