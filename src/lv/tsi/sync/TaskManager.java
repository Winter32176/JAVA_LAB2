package lv.tsi.sync;

public class TaskManager {
    synchronized void performTask(int taskId){
        System.out.printf("name: %s value of taskId: %d\n", Thread.currentThread().getName(), taskId);
        try {
            Thread.sleep(4);
        } catch (InterruptedException e) { }
        System.out.printf("name: %s value of taskId: %d\n", Thread.currentThread().getName(), taskId);
    }

    // "synchronized" makes that first go first Thread then second. No random.
}
