package abstractFactory.bean;

public class AudiTruck extends Truck {
    @Override
    public void run() {
        System.out.println("奥迪卡车发动");
    }
}
