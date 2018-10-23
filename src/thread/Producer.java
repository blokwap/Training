package thread;

public class Producer implements Runnable {
    private String name;
    private Product product;

    public Producer(String name, Product product) {
        this.name = name;
        this.product = product;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            if (i % 2 == 0) {
                try {
                    //synchronized (product){
                    product.put("玉米", "黄色");
                    //}

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    //synchronized (product){
                    product.put("馒头", "白色");
                    //}

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            i++;
        }
    }
}
