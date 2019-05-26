package abstractFactory;

/**
 * 轿车类型  相当于一个配置文件
 */

public enum SaloonType {
    BMWSaloon("宝马汽车"), AudiSaloon("奥迪汽车"),BMWTrucl("宝马卡车"), AudiTrucl("奥迪卡车");

    private String name;

    SaloonType(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
