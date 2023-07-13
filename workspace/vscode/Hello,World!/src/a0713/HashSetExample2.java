package a0713;

import java.util.*;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println( element);
            if(element.equals("JSP")) {
                iterator.remove();
            }
        }

        /* 
        iterator는 컬렉선의 요소들을 순회하면서 접근하는 인터페이스 
        iterator는 컬렉션의 내부 구조를 알 필요없이 요소들에 접근할수 있도록 해준다.
        */
        System.out.println();
        set.remove("JDBC"); /* hashset에서 제거 */

        for(String element : set) {
            System.out.println(element);
        }
        /* 
            set에서 저장된 객체를 하나씩 가져와서 처리
        */
    }
}
