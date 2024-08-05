package set;

import java.util.HashSet;

public class Set1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(3);
        System.out.println(set.size());
        System.out.println(set);
    }
}
