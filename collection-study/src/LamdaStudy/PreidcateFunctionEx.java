package LamdaStudy;

import java.util.function.Function;
import java.util.function.Predicate;

public class PreidcateFunctionEx {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> Integer.parseInt(s, 16);
        Function<Integer, String> g = Integer::toBinaryString;

        // andThen, compose 함수 결합하기
        Function<String, String> h = f.andThen(g); // f와 g 결합
        Function<Integer, Integer> h2 = f.compose(g); // g andThen(f) 순서를 g를 앞에 새움

        System.out.println(h.apply("FF")); // 11111111

        // 항등함수 identity function
        // 아무 변화 없이 입력을 그대로 반환
        Function<String, String> f2 = x -> x;

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate(); // i >= 100

        Predicate<Integer> all = notP.and(q.or(r)); // i >= 100 && ( i < 200 || i % 2 == 0)

        // string 2개를 비교하기 Predicate는 입력을 하나밖에 못받는데 어떻게 할까
        String str1 = "aaa";
        String str2 = "aaa";

        Predicate<String> p2 = Predicate.isEqual(str1);

        boolean res = p2.test(str2);
        boolean res2 = Predicate.isEqual(str1).test(str2);
    }
}