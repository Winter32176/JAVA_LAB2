package lv.tsi.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class AddingThread extends Thread {
    private BlockingQueue<String> blockingQueue = new LinkedBlockingDeque<>();

    public AddingThread(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            blockingQueue.add("Element" + i);
            var a = blockingQueue;
            for (int j = 0; j < 3; j++) {
                if (!a.isEmpty()) {
                    if (!(a.peek().contains("Element" + i))) {
                        a.poll();
                    } else {
                        System.out.printf("! Added successfully {%s}\n", a.element());
                        break;
                    }
                }
            }

        }
    }
}
