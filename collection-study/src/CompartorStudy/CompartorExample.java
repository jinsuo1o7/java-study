package CompartorStudy;

import java.util.Arrays;
import java.util.Comparator;

public class CompartorExample {
    public static void main(String[] args) {
        // sort(Object[] o) Comparable 인터페이스를 구현 정렬을 함 ( 기본 값 )
        // sort(Object[] o, Comparator c) Comparator를 기준으로 정렬 정렬

        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // compartor로 정렬 기준 정함 (대소문자 구분 안함)
        Arrays.sort(strArr, new Desending()); // 역순 정렬
    }
}

class Desending implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;

            return c1.compareTo(c2) * -1; // 기본 정렬 결과에 음수를 곱해서 역순으로 함
        }
        return -1;
    }
}