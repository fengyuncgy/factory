package methodFactory;

/**
 * 轿车类型  相当于一个配置文件
 */

public enum SaloonType {
    BMW("宝马汽车", "simpleFactory.bean.BmwSaloon"), Audi("奥迪汽车", "simpleFactory.bean.AudiSaloon");

    private String name;
    private String className;

    SaloonType(String name, String className) {
        this.name = name;
        this.className = className;
    }


    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }
}
