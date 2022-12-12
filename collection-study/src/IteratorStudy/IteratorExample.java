package IteratorStudy;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        IteratorExample ie = new IteratorExample();

        Collection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println("it.next = " + it.next());
        }

        // iterator를 재사용하려면 다시 생성해야 함
        it = list.iterator();
        while (it.hasNext()) {
            System.out.println("it.next = " + it.next());
        }

        // Map에는 iterator가 없다 ( Collection 인터페이스를 구현하지 않아서 )
        Map<Integer, String> map = new HashMap<>();
        // keySet(), entrySet(), values()로 Set이나 Collection을 얻고 iterator로 돌아야 함
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        Set<Integer> keyes = map.keySet();

        Iterator<Integer> kit = keyes.iterator();
        Iterator<String> vit = map.values().iterator();
        Iterator eit  = map.entrySet().iterator();

        while (kit.hasNext()) {
            System.out.println(kit.next());
        }
        while (vit.hasNext()) {
            System.out.println(vit.next());
        }
        while (eit.hasNext()) {
            System.out.println(eit.next().toString());
        }
    }
}