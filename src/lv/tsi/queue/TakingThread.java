package lv.tsi.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class TakingThread extends Thread {
    private BlockingQueue<String> blockingQueue1 = new LinkedBlockingDeque<>();

    public TakingThread(BlockingQueue<String> blockingQueue) {
        this.blockingQueue1 = blockingQueue;
    }

    // Task don't say to fill BlockingQueue and it is empty.
    //6. Rewrite method run:
    //a. Call sleep for 1 second
    //b. Take the element from the queue and output information to the screen
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        for (int i = 0; i < 3; i++) {
            var a = blockingQueue1;
            for (int j = 0; j < 3; j++) {
                if (!a.isEmpty()) {
                    if (!(a.peek().contains("Element" + i))) {
                        a.poll();
                    } else {
                        System.out.printf("Added successfully {%s}\n", a.element());
                        break;
                    }
                }
            }

        }
    }
}
