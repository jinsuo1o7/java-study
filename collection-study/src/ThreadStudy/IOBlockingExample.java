package ThreadStudy;

import java.util.Scanner;

class CountDownThread implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }
    }
}

public class IOBlockingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        Thread th = new Thread(new CountDownThread());
        th.start();

        // 입력을 받기 전까지 프로그램이 정지 됨
        String input = scanner.nextLine();

        // 싱글 쓰레드의 경우 카운트 다운이 되지 않음
//        for (int i = 10; i >= 0; i--) {
//            System.out.println("i = " + i);
//        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

}
