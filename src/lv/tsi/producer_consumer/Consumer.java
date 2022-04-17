package lv.tsi.producer_consumer;

public class Consumer extends Thread {
    Goods goods = new Goods();

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        System.out.println("Consumed: " + goods.consume());
    }

}
