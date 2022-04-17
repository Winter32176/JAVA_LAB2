package lv.tsi.priority.task1;

public class PriorityMain {

    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("min");
        PriorityThread t2 = new PriorityThread("norm");
        PriorityThread t3 = new PriorityThread("max");

        t1.setPriority(2);
        t2.setPriority(4);
        t3.setPriority(8);

        t1.start();
        t2.start();
        t3.start();
    }

}
