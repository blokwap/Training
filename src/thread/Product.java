package thread;

public class Product {
    private String name;
    private String color;
    private boolean isProduce = false;

    public synchronized void get(String name) throws InterruptedException {
        if (!isProduce) {
            notify();
            wait();
        }else{
            System.out.println("消费者" + name + "消费:" + this.name + " " + color + " 生产状态 " + isProduce);
            isProduce = false;
            //notify();
        }

    }

    public synchronized void put(String name, String color) throws InterruptedException {
        if (isProduce) {
            notify();
            wait();
        }else{
            this.name = name;
            this.color = color;
            System.out.println("生产者" + name + "生产:" + this.name + " " + color + " 生产状态 " + isProduce);
            isProduce = true;
            //notify();
        }


    }
}
