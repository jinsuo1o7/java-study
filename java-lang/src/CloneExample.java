class Point implements  Cloneable{
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Point clone() throws CloneNotSupportedException { // 반환타입을 Object가 아닌 Point로
        return (Point)super.clone(); // Point로 형변환 해준다
    }
}

public class CloneExample {
    public static void main(String[] args) {

    }
}
