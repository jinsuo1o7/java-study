package EnumStudy;

// 거리에 따라 요금 계산 방식이 다른 운송 수단을 위해 추상 메소드 추가
enum Transportation {
    BUS(100) {
        @Override
        int getFare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    TRAIN(150) {
        @Override
        int getFare(int distance) {
            return distance * BASIC_FARE;
        }
    }, SHIP(100) {
        @Override
        int getFare(int distance) {
            return distance * BASIC_FARE;
        }
    }, AIRPLANE(300) {
        @Override
        int getFare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    // protected로 해서 각 상수에 접근 가능하게 함
    protected final int BASIC_FARE;

    Transportation(int BASIC_FARE) {
        this.BASIC_FARE = BASIC_FARE;
    }

    // 운송 요금 계산을 추상메소드로 선언해야 함
    abstract int getFare(int distance);

    int getBASIC_FARE() {
        return this.BASIC_FARE;
    }
}

public class EnumAbstarctExample {
    public static void main(String[] args) {
        Transportation bus = Transportation.BUS;
        System.out.println("bus.getFare(400) = " + bus.getFare(400));
    }

}
