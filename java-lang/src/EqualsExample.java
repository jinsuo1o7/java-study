import java.util.Objects;

class Node{
    private int key;
    private int value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return key == node.key && value == node.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
public class EqualsExample {
    public static void main(String[] args) {

    }
}
