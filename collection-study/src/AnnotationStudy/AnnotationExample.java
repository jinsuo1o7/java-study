package AnnotationStudy;

import java.util.ArrayList;
import java.util.List;

// 함수형 인터페이스 ( 하나의 추상 메소드만 가져야 하는 것을 알림 )
@FunctionalInterface
interface FuntionalInterfaceExample {
    void abstractMethod();
}

class SuperClass {
    void superMethod() {
    }
}

class SubClass extends SuperClass {
    // Deprecated 앞으로 사용하지 말것을 권장
    @Deprecated
    static void deprecatedMethod() {
        System.out.println("Deprecated");
    }

    @Override
    void superMethod() {
        System.out.println('a');
    }
}

public class AnnotationExample {
    public static void main(String[] args) {
        SubClass.deprecatedMethod();

        // 컴파일러 경고 메시지를 나타나지 않게 해줌
        // 프로그램실행에 경고가 문제가 없을경우 억제
        // 프로그래머가 경고를 알고 있고 일부러 억제하는데 목적
        @SuppressWarnings("unckeced")
        List list = new ArrayList();
        list.add('4');
    }
}
