package lv.tsi.priority.task1;

public class PriorityThread extends Thread{
    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.printf("Name: %s iteration: %d \n",getName(),i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { }
        }
    }
}
