package LamdaStudy;

import java.util.function.Function;

public class MethodRefEx {
    public static void main(String[] args) {
        // 람다식을 메소드 참조로 간단히 할 수 있음
        Function<String, Integer> f = (s) -> Integer.parseInt(s);
        // 입력으로 주어지는 String의 타입을 알고 있으므로 s를 제거하면
        Function<String, Integer> fr = Integer::parseInt;
        // ClassName::method 이렇게 메소드 참조로 표현
        // 하나의 메소드만 호출하는 람다식은 ClassName::method(메소드 참조)로 바꾸는게 가능


    }
}
