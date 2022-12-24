package ThreadStudy;

class DaemonThread implements Runnable {
    static boolean autoSave = false;

    @Override
    public void run() {
        while (true) { // 무한 루프로 쓰레드가 종료 될 때 까지 종료되지 않음
            try {
                Thread.sleep(3 * 1000); // 3초마다 sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (autoSave) {
                DaemonThreadExample.autoSave();
            }
        }
    }
}

public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread daemon = new Thread(new DaemonThread());
        // setDaemon : 쓰레드를 데몬 쓰레드로 설정
        daemon.setDaemon(true);
        daemon.start();
        // isDaemon() : 쓰레드가 데몬 쓰레드인지 판별
        System.out.println("daemon.isDaemon() = " + daemon.isDaemon());

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i = " + i);

            if (i == 5) {
                DaemonThread.autoSave = true;
            }
        }
    }

    public static void autoSave() {
        System.out.println("save");
    }
}
