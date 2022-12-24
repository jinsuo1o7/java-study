package ThreadStudy;

class GetMoney implements Runnable {
    ThreadSyncExample acc = new ThreadSyncExample();

    @Override
    public void run() {
        while (acc.getAccount() > 0) {
            int money = (int) (Math.random() * 3 + 1) * 100;
            acc.withDraw(money);
            System.out.println(acc.getAccount());
        }
    }
}

public class ThreadSyncExample {
    private int account = 1000;

    public static void main(String[] args) {
        Runnable r = new GetMoney();
        new Thread(r).start();
        new Thread(r).start();
    }

    public synchronized int getAccount() {
        return account;
    }

    public synchronized void withDraw(int money) {
        if (account - money >= 0) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account -= money;
        }
    }
}
