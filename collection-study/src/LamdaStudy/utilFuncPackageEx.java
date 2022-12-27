package LamdaStudy;

import java.util.function.*;

public class utilFuncPackageEx {
    public static void main(String[] args) {
        // java.util.function 패키지

        // Runnable
        // 매개변수 X 반환값 X
        // method : run()
        Runnable runnable = () -> System.out.println("Runnalbe");
        runnable.run();

        // Supplier<T>
        // 매개변수 X 반환값 O
        // method : get()
        Supplier<Integer> supplier = () -> 4;
        System.out.println("supplier.get() = " + supplier.get());

        // Consumer<T>
        // 매개변수 O 반환값 X
        // method : accept(param)
        Consumer<Integer> consumer = (x) -> System.out.println("x = " + x);
        consumer.accept(4);

        // Function<T,R>
        // 매개변수 O 반환값 O
        // method : apply(param)
        Function<Integer, String> function = (x) -> x + "";
        System.out.println("function = " + function.apply(3));

        // Predicate<T>
        // 매개변수 하나, 반환타입 boolean
        // method : test(param)
        Predicate<Integer> predicate = (x) -> x == 4;
        System.out.println(predicate.test(4));

        // BiConsumer<T,U> 매개변수가 2개인 Consumer
        BiConsumer<String, String> biConsumer = (str1, str2) -> System.out.println(str1.concat(str2));

        // BiPredicate 조건식을 표현하는데 매개변수를 2개 사용
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x.equals(y);
    }
}
