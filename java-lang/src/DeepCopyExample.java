import java.util.Objects;

class Circle implements Cloneable {
    Point p;
    double r;

    Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Circle c = (Circle) obj;
        Objects.equals(c, c);
        // deep copy하기 위해 새로운 객체 생성
        c.p = new Point(this.p.x, this.p.y);
        return c;
    }
}

public class DeepCopyExample {
}
