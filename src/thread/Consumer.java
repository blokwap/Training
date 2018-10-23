package thread;

public class Consumer implements Runnable {
    private String name;
    private Product product;

    public Consumer(String name, Product product) {
        this.name = name;
        this.product = product;
    }

    @Override
    public void run() {
        while (true) {
            try {
                //synchronized (product){
                product.get(name);
                //}
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
