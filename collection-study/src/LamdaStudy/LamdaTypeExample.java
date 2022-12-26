package LamdaStudy;

// 함수형 인터페이스 - 단 하나의 추상메소드만 선언된 인터페이스
@FunctionalInterface // 함수형 인터페이스 에너테이션 단 하나의 메소드만 가져야 함을 선언
interface SimpleFun {
    int max(int a, int b);
}

public class LamdaTypeExample {
    public static void main(String[] args) {
        // 람다식을 익명 객체로 표현한 예
        // Object obj = (a, b) -> a < b ? a : b
        // 모든 메소드는 객체 안에 있어야하므로 익명 객체를 생성해서 메소드를 만들었음
        Object obj = new Object() {
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };
        // 하지만 익명객체로부터 메소드를 호출하려고 했더니 에러가 나옴
        // int val = obj.max(3, 5); // error Object는 max 메소드가 없음

        // 함수형 인터페이스를 구현한 예
        SimpleFun fun = new SimpleFun() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };
        int val = fun.max(3, 4); // 인터페이스를 구현했으므로 max호출가능

        // 즉, 람다식의 타입은 익명 객체가 아니라 함수형 인터페이스이다.
        SimpleFun fun1 = (a, b) -> a < b ? a : b;
        // 람다식과 함수형 인터페이스의 매개변수 타입과 반환 타입이 같으므로 참조변수에 들어갈 수 있음
    }
}


