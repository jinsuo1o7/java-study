import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

import static java.util.Objects.compare;

public class ObjectsExample {
    public static void main(String[] args) {
        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D_2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        // Arrays.toString
        for (String[] str : str2D) {
            System.out.println(Arrays.toString(str));
        }

        // equals, deepEquals
        System.out.println(Objects.equals(str2D, str2D_2));
        System.out.println(Objects.deepEquals(str2D, str2D_2));

        // isNull, nonNull, requireNonNull
        System.out.println(Objects.isNull(null));
        System.out.println(Objects.nonNull(null));
        try {
            Objects.requireNonNull(null, "Null Object!");
        } catch (NullPointerException ne) {
            System.out.println(ne.getMessage());
        }

        // compare
        Comparator c = String.CASE_INSENSITIVE_ORDER; // ignore case
        System.out.println(compare("aa", "bb", c));
        System.out.println(compare("aa", "aa", c));
    }
}
