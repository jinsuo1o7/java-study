package ArraysStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};

        // toString
        String arrStr = Arrays.toString(arr1); // [1, 2, 3, 4, 5]

        // copyOf, copyOfRange
        int[] arr2 = Arrays.copyOf(arr1, arr1.length); // 원본 배열 크기만큼 복사
        int[] arr3 = Arrays.copyOf(arr2, 8); // [1, 2, 3, 4, 5, 0, 0, 0]
        int[] arr4 = Arrays.copyOfRange(arr1, 2, 4); // [2,4) 만큼 복사

        // fill, setAll
        int[] emptyArr = new int[10];
        Arrays.fill(emptyArr, 4444); // [4444, 4444, 4444, 4444, 4444, 4444, 4444, 4444, 4444, 4444]
        Arrays.setAll(emptyArr, (i) -> (int) (Math.random() * 5) + 1); // [2, 2, 3, 5, 2, 1, 1, 1, 3, 4]

        // sort, binarySearch
        int[] randomArr = {121, 42, 34, 122, 4543, 8776};
        Arrays.sort(randomArr); // [34, 42, 121, 122, 4543, 8776]
        int target = 42;
        int idx = Arrays.binarySearch(randomArr, target); // 1

        // deepToString, deepEquals
        int[][] arr2D1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr2D2 = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(Arrays.deepToString(arr2D1)); // [[1, 2, 3], [4, 5, 6]]
        System.out.println(Arrays.deepEquals(arr2D1, arr2D2)); // true

        // asList
        int[] listArr = {1, 2, 3};
//        List list1 = Arrays.asList(listArr);
//        List list3 = Arrays.asList(new Integer[]{1,2,3,4});

        // asList만 하면 읽기 전용임
        List list2 = Arrays.asList(1, 2, 3, 4);
        // list2.add(4); 수정하려고 하면 UnsupportedOperationException 예외 발생
        // 수정하려면 새로운 리스트를 생성하면 됨
        list2 = new ArrayList(Arrays.asList(1, 2, 3, 4));
        list2.add(4);
    }
}
