package abstractFactory.bean;

/**
 * 宝马轿车
 */
public class BmwSaloon extends Saloon {
    @Override
    public void run() {
        System.out.println("宝马汽车发动");
    }

    public BmwSaloon() {
    }

    public BmwSaloon(String name) {
        super(name);
    }
}
