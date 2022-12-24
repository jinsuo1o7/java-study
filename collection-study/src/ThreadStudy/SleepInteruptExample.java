package ThreadStudy;

class MyThread implements Runnable {
    @Override
    public void run() {
        // sleep() 은 예외 처리를 해야하기 때문에 함수로 묶음
        delay(1500);
    }

    void delay(int time) {
        try {
            Thread.sleep(time); // sleep은 자기 자신을 재움
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SleepInteruptExample {
    public static void main(String[] args) {
        Thread th1 = new Thread(new MyThread());
        try {
            // th1.sleep(1000); // 주의 ! th1 쓰레드를 재우는 것이 아님 자기 자신을 재우는 것
            Thread.sleep(1000); // sleep을 쓸때는 Thread 클래스 참조변수를 쓰자!
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
