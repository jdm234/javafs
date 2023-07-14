package a0714;

import java.util.Arrays;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> numbes = Arrays.asList(1, 2, 3, 4, 5);

        numbes.forEach(number -> System.out.println(number));
    }
}
