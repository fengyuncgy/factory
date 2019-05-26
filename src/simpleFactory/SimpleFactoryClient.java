package simpleFactory;

import static simpleFactory.SimpleFactory.createSaloonIfElse;
import static simpleFactory.SimpleFactory.createSaloonReflect;
import static simpleFactory.SimpleFactory.createSaloonSwitch;

public class SimpleFactoryClient {

    public static void main(String[] args) {
        createSaloonSwitch(SaloonType.BMW).run();
        createSaloonIfElse(SaloonType.BMW).run();
        createSaloonReflect(SaloonType.BMW).run();
    }
}
