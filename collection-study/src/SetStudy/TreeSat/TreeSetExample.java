package SetStudy.TreeSat;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample{
    public static void main(String[] args) {
        Set set = new TreeSet(); // TreeSet은 BST이므로 정렬을 함

        Set<SimpleData> set2 = new TreeSet<>(); // 기본 정렬 comparable 을 기준으로 함
        Set<SimpleData> set3 = new TreeSet<>(new MyComparatoer()); // 역순으로 정렬하기 Comparator지정

        while(set.size() < 8){
            int num = (int)(Math.random() * 100) + 1;
            set.add(num); // Interger가 Comparable을 구현했으므로 정렬이 됨
        }

        System.out.println(set);

        set2.add(new SimpleData(44));
        set2.add(new SimpleData(4));
        set2.add(new SimpleData(4444));
        set2.add(new SimpleData(444));

        System.out.println("set2 = " + set2);
    }
}

class SimpleData implements Comparable {
    int val;

    SimpleData(int val){
        this.val = val;
    }

    @Override
    public String toString() {
        return this.val + "";
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof SimpleData)) {
            return 0;
        }
        return this.val - ((SimpleData) o).val;
    }
}

class MyComparatoer implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof SimpleData && o2 instanceof SimpleData) {
            return ((SimpleData) o2).val - ((SimpleData) o1).val;
        }
        return 0;
    }
}