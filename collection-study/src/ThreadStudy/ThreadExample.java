package ThreadStudy;

class ClassThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            // 쓰레드의 이름을 반환
            System.out.println(this.getName() + "class");
        }
    }
}

class RunnalbeThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // currentThread() 현재 실행중인 쓰레드의 참조를 반환
            System.out.println(Thread.currentThread().getName() + "runnalbe");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread th1 = new ClassThread();
        // start 쓰레드를 실행 시킴
        th1.start();
        // 한번 실행시킨 쓰레드는 다시 호출 못함 새로 생성하고 실행시켜야 함
        th1 = new ClassThread();
        th1.start();

        System.out.println();

        // Runnable interface를 구현한 클래스를 Thread 인스턴스를 생성하려면 Thread생성자로 넣어야 함
        Thread th2 = new Thread(new RunnalbeThread());

        Runnable r = new RunnalbeThread();
        Thread th3 = new Thread(r);

        th2.start();
    }

}
