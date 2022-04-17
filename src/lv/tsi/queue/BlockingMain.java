package lv.tsi.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingMain {

    public static void main(String[] args) {
        final BlockingQueue<String> blockingQueue = new LinkedBlockingDeque<>();
        AddingThread t1 = new AddingThread(blockingQueue);
        TakingThread t2 = new TakingThread(blockingQueue);
        t1.start();
        t2.start();

    }

}
