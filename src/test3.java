import java.lang.reflect.Array;
import java.util.ArrayList;

public class test3 {
    public static void main(String[] args){
        int [] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        System.out.println("Четные числа");
        for (int a : arr){
            if (a % 2 == 0){
                System.out.println(a);

            }
        }




    }

}
