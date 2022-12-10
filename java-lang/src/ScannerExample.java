import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerExample {
    public static void main(String[] args) {
        String str1 = "100,200,300,400";
        String str2 = "abcd+-*efg";
        StringTokenizer st1 = new StringTokenizer(str1, ","); // 소스 문자열과 delimeter로 생성

        // delimeter가 문자열이지만 StringTokenizer는 한문자씩 구분하기해서 토큰을 나눔
        StringTokenizer st2 = new StringTokenizer(str2, "+- *", true);

        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }
        System.out.println();
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
    }
}
