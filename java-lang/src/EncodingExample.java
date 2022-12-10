import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;

public class EncodingExample {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String[] sArr;
        String str = "jinsuo1o7";

        sArr = new String[18];
        byte[] bArr1 = str.getBytes(StandardCharsets.UTF_8);
        byte[] bArr2 = str.getBytes("CP949");

        StringBuffer rStr = new StringBuffer(str).reverse();
        str = rStr.toString();

        System.out.println("str = " + str);
    }

    static String joinByteArr(byte[] bArr) {
        StringJoiner sj = new StringJoiner(":", "[","]");

        for (byte b : bArr) {
            sj.add(String.format("%02X", b));
        }
        return sj.toString();
    }
}
