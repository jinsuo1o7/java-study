package AnnotationStudy;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target({FIELD, TYPE}) // meta annotation 필드와, 타입에만 사용자 에너테이션을 적용 가능
@interface MyAnnotation { // MyAnnotaion 정의
}

@MyAnnotation
public class CustomAnnotationExample {
    @MyAnnotation
    int i;
}
