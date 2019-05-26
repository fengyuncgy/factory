package abstractFactory.bean;

public class AudiSaloon extends Saloon {
    @Override
    public void run() {
        System.out.println("奥迪汽车发动");
    }

    public AudiSaloon(String name) {
        super(name);
    }
}
