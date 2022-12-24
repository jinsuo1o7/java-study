package ThreadStudy;

class PriorityThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 400; i++) {
            System.out.print(new String("*"));
        }
    }
}

class PriorityThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 400; i++) {
            System.out.print(new String("%"));
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        Thread th1 = new Thread(new PriorityThread1());
        Thread th2 = new Thread(new PriorityThread2());

        // setPriority : 우선순위 설정
        th2.setPriority(10);

        th1.start();
        th2.start();

        // getPriority : 우선순위 반환
        System.out.println(th1.getPriority()); // 5 main쓰레드 기본값 5로부터 생성된 쓰레드
        System.out.println(th2.getPriority()); // 10
    }
}
