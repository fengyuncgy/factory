package abstractFactory.bean;

public class BmwTruck extends Truck {
    @Override
    public void run() {
        System.out.println("宝马卡车发动");
    }
}
