package EnumStudy;

enum Direction {EAST, SOUTH, WEST, NORTH}

class Unit {
    int x, y;
    Direction direction;

    void init() {
        direction = Direction.WEST;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        // 열거형의 상수간의 비교에 == 를 사용할 수 있음
        // <, > 비교는 못하지만 compareTo를 사용할 수 있다.
        Unit unit1 = new Unit();
        Unit unit2 = new Unit();
        unit1.init();
        unit2.init();

        System.out.println(unit1.direction == unit2.direction);

        // 열거형 값 사용법 static과 동일
        unit2.direction = Direction.NORTH;
        System.out.println(unit1.direction.compareTo(unit2.direction));

        // values
        // 열거형의 상수를 배열로 저장해 줌 ( 모든 열거형의 기본 메서드 )
        Direction[] dArr = Direction.values();
        for (Direction d : dArr) {
            System.out.println("d.name() = " + d.name());
            System.out.println(d.ordinal());
        }


        // switch문에 열거형 사용하기
        switch (unit1.direction) {
            case EAST: // Direction.EAST가 아닌 상수 명만 사용해야 함
                System.out.println("unit1.direction = " + unit1.direction);
                break;
            case SOUTH:
                System.out.println("direction = " + unit1.direction);
                break;
            case WEST:
                System.out.println(".direction = " + unit1.direction);
                break;
        }

        // valueOf
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("EAST");
        Direction d3 = Direction.valueOf(Direction.class, "EAST");
    }
}
