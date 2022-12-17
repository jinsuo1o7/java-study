package GenericsStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal {
    int age;
    String name;

    Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Dog extends Animal {
    Dog(int age, String name) {
        super(age, name);
    }
}

class Cat extends Animal {
    Cat(int age, String name) {
        super(age, name);
    }
}

class AnimalCom implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.age - o2.age;
    }
}

class AnimalHouse<T> {
    List<T> list = new ArrayList<>();

    void add(T animal) {
        list.add(animal);
    }

    T get(int idx) {
        return list.get(idx);
    }

    List<T> getList() {
        return list;
    }
}

public class GenericWildCard {
    public static void main(String[] args) {
        AnimalHouse<Animal> house = new AnimalHouse<>();
        house.add(new Dog(444, "dogo"));
        house.add(new Dog(44, "dogo"));
        house.add(new Dog(4, "dogo"));
        house.add(new Dog(4444, "dogo"));

        Collections.sort(house.getList(), new AnimalCom());

        System.out.println(house.getList().toString());
    }
}
