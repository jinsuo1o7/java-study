package LamdaStudy;

import java.util.*;

public class CollectionWithLamda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // forEach(Consumer<T>)
        // Consumer 인터페이스를 받아서 모든 요소에 적용 함
        list.forEach(i -> System.out.print(i + ", "));
        System.out.println();
        // 이제 iterator로 빙빙 도는 코드를 간략하게 작성할 수 있음
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next());
//        }


        // removeIf
        // Predicate<T>를 받아서 true일경우 제거
        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println(list);

        // replaceAll
        list.replaceAll(i -> i * 10); // 각 요소에 10을 곱함

        Map<String, String> map = new HashMap<>();
        map.put("1", "jinsuo1");
        map.put("2", "jinsuo2");
        map.put("3", "jinsuo3");
        map.put("4", "jinsuo4");

        // Map에서의 forEach(BiConsumer<K, V>)
        // lamda식을 사용하면 맵을 출력하기 편해 짐
        map.forEach((k, v) -> System.out.println("{" + k + "," + v + "}"));
        System.out.println();

        // 이전에는 Iterator로 entrySet을 돌았음
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}
