package ListStudy;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(5);
        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.add(0);

        ArrayList<Integer> list2 = new ArrayList<>(list1.subList(1, 4));
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        list1.sort(c);
        Collections.sort(list2);

        list2.add(Integer.valueOf("444"));
        list2.add(44444);

        list1.retainAll(list2); // list1 에서 list2의 교집합만 남기고 다 제거
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        // list2에서 list1이 가진 요소를 제거
        // 마지막에서부터 제거해야 shift가 일어나지 않음
        for (int i = list2.size(); i >= 0; i--) {
            if (list2.contains(list1.get(i))) {
                list2.remove(i);
            }
        }
    }
}
