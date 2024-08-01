public class Variable1 {
    public static void main(String[] args) {
        // 정수
        byte b = 100;  // 1byte 8bit
        short s = 100; // 2byte 16bit
        int x = 300000000;    // 4byte 32bit  Default
        long y = 3000000000L;   // 8byte 64bit

        byte result = (byte) (b + b);
        System.out.println(result);

        int a1 = 1500000000;
        int a2 = 1500000000;
        long result2 = a1*1L + a2;
        System.out.println(result2);

        char c = 'a';
        System.out.println((int)c);

        // 논리형
        boolean b1 = true;
        System.out.println(b1);


        // 실수
        float z = 5.0f;
        double d = 5.0;  // Default

    }
}
