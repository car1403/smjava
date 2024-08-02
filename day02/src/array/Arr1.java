package array;

public class Arr1 {
    public static void main(String[] args) {
        int a[]  = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        int b[] = {2,3,4};

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        for(int num:a){
            System.out.println(num);
        }

    }
}



