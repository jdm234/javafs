package a0714;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class St8 {
    public static void main(String[] args){
        Stream<String> stream1 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
      Stream<String> stream2 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
      
      stream1.sorted().forEach(s -> System.out.print(s + " "));
      System.out.println();
      
      stream2.sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s + " "));
   }
}
