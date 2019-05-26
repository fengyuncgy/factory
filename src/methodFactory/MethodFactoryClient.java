package methodFactory;

import methodFactory.factory.AudiSaloonFactory;
import methodFactory.factory.BmwSaloonFactory;
import methodFactory.factory.SaloonFactory;

public class MethodFactoryClient {


    /**
     * 工厂方法是简单工厂升级版
     * 解决简单工厂不符合开关闭原则的缺点
     *
     * 缺点
     * 每个种类都需要一个工厂方法
     *
     * 我理解的应用场景：
     * 宝马旗下的各个车型
     */

    public static void main(String [] args){
        SaloonFactory saloonFactory = new AudiSaloonFactory();
        saloonFactory.createSaloon().run();
        SaloonFactory bmwSaloonFactory = new BmwSaloonFactory();
        bmwSaloonFactory.createSaloon().run();


    }
}
