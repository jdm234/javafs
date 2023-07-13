package a0707;

import java.util.Arrays;
import java.util.Collections;

public class Arrays3_1 {
    public static void main(String[] args) {
        integer arr[] = (4, 23, 33, 15, 17, 19);
        Arrays.sort(arr, Collections.reverseOrder());

        for (integer i : arr) {
            System.out.println("{"+i+"}");
        }
    }
}
