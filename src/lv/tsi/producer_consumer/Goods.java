package lv.tsi.producer_consumer;

public class Goods {
    private int amount = 0;

    synchronized void produce(int newAmount) {
        while (amount > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        amount = newAmount;
        notify();


    }

    synchronized int consume() {
        while (amount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        amount-=5;
        notify();
        return 5;
    }


}
