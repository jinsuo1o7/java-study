package LamdaStudy;

interface MyFunc {
    void run();
}

public class LamdaParamExample {
    static void execute(MyFunc f) { // param으로 함수형 인터페이스를 받아서 호출하는 함수
        f.run();
    }

    static MyFunc getMyFunc() {
        return () -> System.out.println("f3.run()"); // 반환타입이 함수형 인터페이스
    }

    public static void main(String[] args) {
        MyFunc f1 = () -> System.out.println("f1.run()"); // 람다식으로 구현한 예

        MyFunc f2 = new MyFunc() { // 익명 클래스로 인터페이스를 구현한 예
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunc f3 = getMyFunc();

        f1.run();
        f2.run();
        f3.run();
    }
}
