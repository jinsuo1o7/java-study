package SetStudy.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetRetainExample {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        Set<Integer> unionSet = new HashSet<>();
        Set<Integer> interSectionSet = new HashSet<>();
        Set<Integer> subtractionSet = new HashSet<>();

        set1.add(4);
        set1.add(44);
        set1.add(444);
        set1.add(4444);
        set1.add(44444);

        set2.add(4);
        set2.add(44);
        set2.add(555);
        set2.add(5555);
        set2.add(55555);

//         set1.addAll(set2); 합집합
//         set1.retainAll(set2); 교집합
//         set1.removeAll(set2); 차집합

        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()) {
            int temp = it.next();
            if (set2.contains(temp)) {
                interSectionSet.add(temp);
            }
        }
        it = set1.iterator();


        while (it.hasNext()) {
            int temp = it.next();
            if (!set2.contains(temp)) {
                subtractionSet.add(temp);
            }
        }

        it = set1.iterator();
        while (it.hasNext()) {
            unionSet.add(it.next());
        }
        it = set2.iterator();
        while (it.hasNext()) {
            unionSet.add(it.next());
        }

        System.out.println("unionSet = " + unionSet);
        System.out.println("interSectionSet = " + interSectionSet);
        System.out.println("subtractionSet = " + subtractionSet);
    }
}
