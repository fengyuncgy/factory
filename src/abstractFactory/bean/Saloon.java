package abstractFactory.bean;

/**
 * 轿车的抽象类
 */
public abstract class Saloon {

    protected String name;

    /**
     * 轿车启动
     */
    public abstract void run();


    public Saloon(String name) {
        this.name = name;
    }

    public Saloon() {
    }
}
