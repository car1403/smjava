package list;

import java.util.ArrayList;

public class List1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);

        System.out.println(list.size());
        System.out.println(list);

        for(int num:list){
            System.out.println(num);
        }

    }
}




