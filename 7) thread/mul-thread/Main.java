public class Main {
    public static void main(String[] args) {
        SharedSequence sharedSequence = new SharedSequence();
        Series t1 = new Series(sharedSequence, 1, 5, 1);
        Series t2 = new Series(sharedSequence, 101, 105, 2);
        Series t3 = new Series(sharedSequence, 201, 205, 3);

        t1.start();
        t2.start();
        t3.start();
    }
}
 class SharedSequence {
    private int threadNumber = 1;

    public synchronized int getThreadNumber() {
        return threadNumber;
    }

    public synchronized void setThreadNumber(int threadNumber) {
        this.threadNumber = threadNumber;
    }
}

 class Series extends Thread {
    private final SharedSequence sharedSequence;
    private final int start;
    private final int end;
    private final int threadNumber;

    public Series(SharedSequence sharedSequence, int start, int end, int threadNumber) {
        this.sharedSequence = sharedSequence;
        this.start = start;
        this.end = end;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            synchronized (sharedSequence) {
               while (sharedSequence.getThreadNumber() != threadNumber) {
                    try {
                        sharedSequence.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+": "+i);
                if (threadNumber == 3) {
                    sharedSequence.setThreadNumber(1);
                } else {
                    sharedSequence.setThreadNumber(threadNumber + 1);
                }
                sharedSequence.notifyAll();
            }
        }
    }
}

