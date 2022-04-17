package lv.tsi.producer_consumer;

public class Producer extends Thread{
    Goods goods = new Goods();

    public Producer(Goods goods) {
        this.goods = goods;
    }
    @Override
    public void run(){
       while (true){
           goods.produce(50);
           System.out.println("Produced: 50");
       }
    }
}
