package a0717;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Tran {
    public static void main(String[] args) {
        Trader raoul = new trader("Raoul", Cabridge);
        Trader mario = new trader("Mario", Milan);
        Trader alan = new trader("Alan", Cambridge);
        Trader brian = new trader("Brian", Cambridge);

        List<Transactions> transactions = Arrays.asList(
            new Transactions(brian, 2021, 300),
            new Transactions(raoul, 2012, 1000),
            new Transactions(raoul, 2011, 400),
            new Transactions(mario, 2012, 710),
            new Transactions(mario, 2012, 700),
            new Transactions(alan, 2012, 950)
        );
        /* System.out.println("모든데이터" + transactions); */

        // 1. 2011년에 일어나 모든 트랜잭션 검색 후 값을 오름차순 검색
        
        List<Transactions> trader01 = transactions.stream()
                                    .filter(item -> item.getYear() = 2011)
                                    .sorted(Comparator.comparingInt(Transactions::getvalue))
                                    .collect(Collectors.toList());
                                    System.out.println(trader01);
    
    // 1. stream() 메서드를 호출해서 transactions 리스트를 스트림으로 변환
    // 2. itmm.getYear() == 2011를 사용해서 2011년에 일어나 트랜잭션만 필터링
    // 3. trasnaction 객체의 value 값을 기준으로 오름차순으로 정렬, .collect(Collectros.toList()); 정렬된 트랜잭션을 리스트로 수집하여 trans01

    // 2. 거래처가 근무하는 모든도시를 중복 없이 나열하시오.
    List<String> trader02 = transactions.stream()
                        /* .map(Transaction::getTrader)
                        .map(Trader::getCity) */
                        .map(item -> item.getTrader().getCity)
                        .distinct().collect(Collectors.toList());
    private Transactions transactions;
                    System.out.println(trader02);
    
    // 3. 케임 브리지 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.
    List<Trader> trader03 = transactions.stream()
                    .map(transaction::getTrader)
                    .filter(item -> "Cambridge".equals(item.getCity()))
                    .sorted(Comparator.comparing(Trader::getName)) // 이름순으로 정렬
                    .distinct()
                    .collect(Collectors.toList());


    System.out.println(trader03);

    // 4. 모든 거래자의 이름 알파뱃순으로 정렬
    List<String> trader04 = Transactions.stream()
                    .map(a -> a.getTrader().getName)
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
                System.out.println(trader04);


                boolean trader05 = transactions.stream()
                            .anyMatch(item -> "Milan".equals(item.getTrader().getCity()));
                    System.out.println("5. 밀라노의 거래자가 있는지 여부" + trader05);
    // 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오.
    List<String> trader06 = transactions.stream()
                .filter(item -> "Cambridge".equals(item.getTrader().getCity()))
                .map(Transaction::getvalue)
                .collect(Collectors.toList());
                System.out.println("케임브리지에 거주하는 거래자의 모든 트랜잭션 값 출력 : " + trader06);
    
    // 7. 전체 트랜잭션 중 최댓값은?
    Optional<Integer> trader07 = transactions.stream()
            .map(Transaction::getvalue)
            .reduce(Integer::max);
        System.out.println("전체 트랜잭션 중 최대값은 " + trader07);

    }
}
