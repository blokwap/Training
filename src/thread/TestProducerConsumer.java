package thread;

public class TestProducerConsumer {
    public static void main(String[] args) {
        Product product = new Product();
        Producer producer = new Producer("1号", product);
        Consumer consumer1 = new Consumer("1号", product);
        Consumer consumer2 = new Consumer("2号", product);
        Consumer consumer3 = new Consumer("3号", product);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer1);
        Thread t3 = new Thread(consumer2);
        Thread t4 = new Thread(consumer3);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
