package LamdaStudy;

import java.util.function.Function;
import java.util.function.Supplier;

class SimpleClass {
    private int data;

    public SimpleClass() {
        this.data = 4;
    }

    public SimpleClass(int data) {
        this.data = data;
    }
}

public class ConstructorMethodRef {
    public static void main(String[] args) {
        // Supplier로 생성자를 반환하는 람다식
        Supplier<SimpleClass> supplier = () -> new SimpleClass();

        // 생성자 메소드 참조로 변환가능
        Supplier<SimpleClass> supplierRef = SimpleClass::new;

        // Function으로 객체를 생성하는 코드
        // 생성자에 파라미터가 필요한 경우에도 어차피 입력의 타입을 알고 있기 때문에 생략 가능
        Function<Integer, SimpleClass> function = x -> new SimpleClass(x);
        Function<Integer, SimpleClass> functionRef = SimpleClass::new;

        // 배열
        // Integer x를 입력받으면 배열로 반환하는 람다식
        Function<Integer, int[]> f = (x) -> new int[x];
        // 생성자 참조로 변환 가능
        Function<Integer, int[]> fr = int[]::new;

    }
}
