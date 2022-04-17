package lv.tsi.producer_consumer;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        Goods g1 =new Goods();
        Consumer c1 =new Consumer(g1);
        Producer p1 =new Producer(g1);
        c1.start();
        p1.start();

    }
}
