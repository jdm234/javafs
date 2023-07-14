package a0714;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class St1 {
    public static void main(String[] args) {
        String[] arr = new String[]{"넷", "둘", "셋", "하나"};
        // 배열에서 스트림 생성

        Stream<String> Stream1 = Arrays.stream(arr);
        Stream1.forEach(e -> System.out.print(e + " "));
        System.out.println();

        Stream<String> Stream2 = Arrays.stream(arr, 1, 3);
        Stream2.forEach(e -> System.out.print(e + " "));
    }
}
