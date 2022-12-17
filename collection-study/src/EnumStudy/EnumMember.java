package EnumStudy;

enum Card { // 하나의 열거형 상수에 여러 값을 정해주기 ( 생성자와 지역변수를 명시해줘야 함 )
    SPADE(1, "^"), CLOVER(2, ">"), HEARTH(3, "u"), DIAMOND(4, "<");

    private static final Card[] CARD_ARR = Card.values();
    private final int val; // 필드(인스턴스 변수 추가)
    private final String dir;

    Card(int val, String dir) { // 생성자 추가 ( 열거형의 생성자는 암묵적으로 private로 되어 있음 )
        this.val = val;
        this.dir = dir;
    }

    public static Card of(int dir) {
        if (dir < 0 || dir > 4) {
            throw new IllegalArgumentException("Invalid value : " + dir);
        }
        return CARD_ARR[dir - 1];
    }

    public Card rotate(int num) {
        num = num % 4;
        if (num < 0) {
            num += 4;
        }
        return CARD_ARR[(val - 1 + num) % 4];
    }

    public int getVal() {
        return val;
    }

    public String getDir() {
        return dir;
    }

    @Override
    public String toString() {
        return "Card{" +
                "val=" + val +
                ", dir='" + dir + '\'' +
                '}';
    }
}

public class EnumMember {
    public static void main(String[] args) {
        // Card c1 = new Card(1); 열거형의 생성자가 private이기 때문에 에러
        for (Card c : Card.values()) {
            System.out.printf("%s=%d%n", c.name(), c.getVal());
        }

        Card c1 = Card.CLOVER;
        Card c2 = Card.of(2);

        System.out.println("Card.CLOVER.rotate(1) = " + Card.CLOVER.rotate(4));
    }
}
