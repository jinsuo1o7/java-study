package GenericsStudy;

import java.util.ArrayList;
import java.util.List;

interface Eatable {
}

class Fruit implements Eatable {
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit implements Eatable {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Orange extends Fruit {
    @Override
    public String toString() {
        return "Orange";
    }
}

// 제한된 지네릭 클래스
// 타입변수로 Fruit의 자식이여야하며 Eatable인터페이스를 구현한 클래스여야 함
class FruitBox<T extends Fruit & Eatable> {
    List<T> list = new ArrayList<>();

    void add(T fruit) {
        list.add(fruit);
    }

    T get(int idx) {
        return list.get(idx);
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return "FruitBox{" +
                "list=" + list +
                '}';
    }
}


public class GenericsExample {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleFruitBox = new FruitBox<>();

        // Orange클래스는 Eatable인터페이스를 구현하지 않아서 컴파일 에러
        // Fruit<Orange> orangeBox = new FruiteBox<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // 다형성 성립
    }
}