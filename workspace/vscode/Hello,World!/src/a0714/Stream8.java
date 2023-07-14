package a0714;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream8 {
    public static void main(String[] args) {
        /* 정수로 구성된 리스트에서 짝수로만 필터링하고, 필터링된 짝수들의 제곱 값을 구하여 리스트로 반환하는 스트림연산 */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> squaredEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

    public class User {
            private String name;
            private int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }    

        /*
            문자열로 구성된 리스트에서 길이가 5이상인 문자열을 필터링하고, 필터링된 문자열들을 대무자로 변환하여 콤마(,)로 구분된 하나의 문자열로
            결합하는 스트림 연산:
        */
        List<String> strings = Arrays.asList("apple", "banana", "carrot", "dragonfruit", "eggplant");
        String result = strings.stream()
                .filter(s -> s.length() >= 5)
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));

        List<User> users = Arrays.asList(
                new User("Alice", 25),
                new User("Bob", 30),
                new User("charlie", 20),
                new User("David", 22));
        Optional<User> youngestUser = users.stream()
                .filter(user -> user.getAge() >= 20)
                .min(Comparator.comparing(User::getName));
        /*
          사용자 객체(User)의 리스트에서 모든 사용자의 나이를 합산한 값을 구하는 스트림 연산;
         */
        List<User> user = Arrays.asList(
                new User("Alice", 25),
                new User("Bob", 30),
                new User("charlie", 20),
                new User("David", 22));
        int totalAge = users.stream()
                .mapToInt(User::getAge)
                .sum();
        /*
         * 문자열로 구성된 리스트에서 중복을 제거 하고 알파벳 순으로 정렬된 리스트로 변환하는 스트림 연산;
         */
        List<String> string = Arrays.asList("apple", "banana", "carrot", "dragonfruit", "eggplant");
        List<String> uniqueSortedStrings = strings.stream()
                .distinct()
                .sorted()
                .collect(Collections.toList());
    }
}
