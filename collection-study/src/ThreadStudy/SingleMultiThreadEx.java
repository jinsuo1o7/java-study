package ThreadStudy;

class SimpleThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(new String("-"));
        }
    }
}

class SimpleThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(new String("|"));
        }
    }
}

public class SingleMultiThreadEx {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread th1 = new Thread(new SimpleThread1());
        Thread th2 = new Thread(new SimpleThread2());

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("소요시간 :: " + (System.currentTimeMillis() - startTime));
    }
}
