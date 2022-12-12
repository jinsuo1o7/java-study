package SetStudy.TreeSat;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSubSetExample {
    public static void main(String[] args) {
        Collection c = null;
        TreeSet st = new TreeSet();

        int[] arr = {29, 12, 42, 13, 214, 5346};
        for (int num : arr) {
            st.add(num);
        }

        // headSet, tailSet은 TreeSet에서 지원 Set인터페이스에서는 없음
        System.out.println(st.headSet(42)); // 42보다 작은 값 ( 42 미포함 )
        System.out.println(st.tailSet(42));// 42보다 큰 값 ( 42 미포함 )
    }
}
