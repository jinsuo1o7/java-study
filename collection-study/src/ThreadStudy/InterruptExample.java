package ThreadStudy;

import java.util.Scanner;

class SimpleCountThread extends Thread {
    int i = 10;

    static void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("interrupt 발생");
        }
    }

    @Override
    public void run() {
        while (i >= 0 && !isInterrupted()) {
            System.out.println(i--);
            delay(1000);
        }
    }
}

public class InterruptExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thread th = new SimpleCountThread();
        th.start();

        String str = sc.nextLine();
        System.out.println("str = " + str);
        th.interrupt(); // 해당 쓰레드를 interrupt 시킴
        System.out.println("th.isInterrupted() = " + th.isInterrupted());
    }
}
