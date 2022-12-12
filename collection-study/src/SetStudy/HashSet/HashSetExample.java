package SetStudy.HashSet;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Integer[] objects = {1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5};
        Set hashSet = new HashSet();

        for (int num : objects) {
            // add할때 중복된 값이 있으면 false를 반환
            System.out.println(num + ":" + hashSet.add(num));
        }

        System.out.println(hashSet); // [1, 2, 3, 4, 5]
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();

        Set randomSet = new HashSet();
        for (int i = 0; i < 10; i++) {
            randomSet.add((int) (Math.random() * 45) + 1);
        }
        
        // Set 은 정렬을 못하므로 List로 옮겨서 정렬해야 함
        List list = new ArrayList(randomSet);
        Collections.sort(list); // Collections util 클래스로 정렬
        System.out.println("list = " + list);
    }
}