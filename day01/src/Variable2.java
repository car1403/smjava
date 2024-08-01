public class Variable2 {
    public static void main(String[] args) {
        // 정수
        // 논리형
        // 실수
        float f1 = 10.3F;  // 4byte 32bit
        double d1 = 10.3; // 8byte 64bit  default

        double result = 10*1.0 / 3;
        System.out.println(result);
        // %d, %s, %f
        System.out.printf("결과는 %10.3f 입니다.",result);
    }
}
