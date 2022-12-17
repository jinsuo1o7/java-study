import java.util.*;

class Data implements Comparable {
    int val;

    Data(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return this.val + "";
    }

    @Override
    public int compareTo(Object o) {
        return this.val - ((Data) o).val;
    }
}

class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Data && o2 instanceof Data) {
            return ((Data) o1).val - ((Data) o2).val;
        }
        return 0;
    }
}

public class TestPlayGround {
    public static void main(String[] args) {
        Data d1 = new Data(4);
        Data d2 = new Data(44);
        Data d3 = new Data(444);
        List<Data> list = new ArrayList<>();
        list.add(d2);
        list.add(d3);
        list.add(d1);

        int[][] arr2D1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr2D2 = {{1, 2, 3}, {4, 5, 6}};

        if (Objects.deepEquals(arr2D1, arr2D2)) {
            System.out.println("arr2D1 == arr2D2");
        }

        int res = Objects.compare(d1, d2, new MyComparator());
        System.out.println("res = " + res);

        Collections.sort(list, new MyComparator());
        System.out.println("list = " + list);

        int[][] arr2D3 = {{1, 2}, {3, 4}, {2, 3}, {6, 5}};
        Arrays.sort(arr2D3, (a, b) -> Integer.compare(a[0], b[0]));
        for (int[] row : arr2D3) {
            System.out.println("row = " + row[0] + row[1]);
        }
        System.out.println(arr2D3.length);

    }
}
