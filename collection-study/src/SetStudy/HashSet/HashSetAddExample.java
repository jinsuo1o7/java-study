package SetStudy.HashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            return ((Person) o).age == this.age && ((Person) o).name.equals(this.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Name :" + name + "Age :" + age;
    }
}

public class HashSetAddExample {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();

        System.out.println(set.add(new Person("Jin", 24)));
        System.out.println(set.add(new Person("Jin", 24)));
        System.out.println(set.add(new Person("Sana", 24)));
    }
}
