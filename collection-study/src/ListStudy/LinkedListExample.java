package ListStudy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(200000);
        LinkedList ll = new LinkedList();

        System.out.println("Insert Back");
        System.out.println(addElementBack(al));
        System.out.println(addElementBack(ll));

        System.out.println("Insert Middle");
        System.out.println(addElementMiddle(al));
        System.out.println(addElementMiddle(ll));

        System.out.println("Remove Back");
        System.out.println(removeElementBack(al));
        System.out.println(removeElementBack(ll));

        addElementBack(al);
        addElementBack(ll);

        System.out.println("Remove Front");
        System.out.println(removeElementFront(al));
        System.out.println(removeElementFront(ll));
    }

    public static long addElementBack(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i + "");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long addElementMiddle(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(400, i + "MID!");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long removeElementBack(List list) {
        long start = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long removeElementFront(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
