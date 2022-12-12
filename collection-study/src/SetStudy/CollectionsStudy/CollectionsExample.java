package SetStudy.CollectionsStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        // 동기화되어 있지 않은 List를 동기화 하기
        List syncList = Collections.synchronizedList(new ArrayList<>());
        
        // readOnly 컬렉션 만들기 ( 수정 불가 )
        List readOnlyList = Collections.unmodifiableList(syncList);

        // Singleton 클래스 만들기
        List singletonList =  Collections.singletonList(syncList);

        // addAll
        Collections.addAll(syncList, 1, 2, 3, 4, 5);
        System.out.println("syncList = " + syncList);

        // rotate
        Collections.rotate(syncList,2);
        System.out.println("syncList = " + syncList);

        // swap
        Collections.swap(syncList, 0, 2);
        System.out.println("syncList = " + syncList);

        // shuffle 무작위로 섞음
        Collections.shuffle(syncList);
        System.out.println("syncList = " + syncList);

        // sort
        Collections.sort(syncList);
        System.out.println("syncList = " + syncList);

        int idx = Collections.binarySearch(syncList,2);
        System.out.println("idx = " + idx);


        // reverse
        Collections.reverse(syncList);
        System.out.println("syncList = " + syncList);

        // max, min
        System.out.println(Collections.max(syncList));
        System.out.println(Collections.min(syncList));

        Collections.fill(syncList, 898989);
        Collections.replaceAll(syncList, 898989, 3);
        System.out.println("syncList = " + syncList);
    }
}
