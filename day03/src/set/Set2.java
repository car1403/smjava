package set;

import java.util.HashSet;
import java.util.Random;

public class Set2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Random rand = new Random();
        // 1~10까지의 숫자를 random 으로 생성
        // set안에 중복되지 않은 6개의 숫자를 넣으시오
        while (set.size() <= 6) {
            set.add(rand.nextInt(10)+1);
        }
        System.out.println(set);

    }
}
