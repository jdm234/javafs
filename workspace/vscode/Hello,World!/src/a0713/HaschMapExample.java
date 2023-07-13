package a0713;

    import java.util.HashMap;
    import java.util.Iterator;
    import java.util.Map;
    import java.util.Map.Entry;
    import java.util.Set;

public class HaschMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("총 Entry 수 : " + map.size()); // 3개
        /* 
            HashMap는 중복이 허용하지 않으므로 마지막에 저장된 값이 대체
        */
        System.out.println("");

        String key = "홍길동";
        int value = map.get(key);
        System.out.println("key" + ": " + value); // 95점
        System.out.println("");

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println();
        /* 
            Map.Entry 인터페이스는 Map 컬렉션에서 키-값 쌍을 나타내는 엔트리를 표현하는 역할
        */
        /* 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기 */
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();
    }
}
