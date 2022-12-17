package GenericsStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Person {
    String name = "";

    Person(String name) {
        this.name = name;
    }
}

public class IteratorGenericExample {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("JJJ"));
        list.add(new Person("jj"));
        list.add(new Person("jjjj"));
        list.add(new Person("JJJ"));

        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            // System.out.println("it.next().name = " + (((Person) it.next()).name)); 지네릭스가 없으면 형변환을 해줘야 함
            System.out.println("it.next().name = " + it.next().name); // 형변환 생략
        }
    }
}
