package lv.tsi.sync;
public class SyncMain {
    public static void main(String[] args) throws InterruptedException {
        final TaskManager tm1 = new TaskManager();
        TaskThread t1 = new TaskThread("First", 1, tm1);
        TaskThread t2 = new TaskThread("Second", 2, tm1);

        t1.start();
        Thread.sleep(2);
        t2.start();
    }
}
