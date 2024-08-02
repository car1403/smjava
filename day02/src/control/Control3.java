package control;

public class Control3 {
    public static void main(String[] args) {
        // 1 ~ 10까지의 합과 평균을 구하시오
        // 홀수의 합과 평균을 구하시오

        int sum = 0;
        double avg = 0.0;
        int cnt = 0;
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 1){
                sum += i;
                cnt++;
            }
        }
        avg = sum*1.0 / cnt;
        System.out.printf(" Result: %d, %f ", sum, avg);

    }
}
