package ThreadStudy;

public class WaitNotifyExample {
    private int account = 1000;

    public static void main(String[] args) {

    }

    public synchronized void withdraw(int money) {
        while (account < money) { // 통장 잔고가 부족하면 루프를 돈다
            try {
                wait(); // wait 는 락을 돌려주고 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void deposit(int money) {
        account += money;
        notify(); // wait를 깨운다 대기중인 쓰레드 중 하나에게 알림
    }
}
