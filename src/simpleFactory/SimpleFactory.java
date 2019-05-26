package simpleFactory;

import org.omg.SendingContext.RunTime;
import simpleFactory.bean.AudiSaloon;
import simpleFactory.bean.BmwSaloon;
import simpleFactory.bean.Saloon;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/**
 * 简单工厂的核心
 * 组成:
 * 具体工厂
 * 抽象的产品
 * 具体的产品
 * <p>
 * 使用场景：
 * <p>
 * <p>
 * 缺点是:
 * 不满足开关闭原则；
 * 例如当有新的品牌时 createSaloon方法需要修改
 */
public class SimpleFactory {


    public static Saloon createSaloonSwitch(SaloonType saloonType) {
        switch (saloonType) {
            case Audi:
                return new AudiSaloon(saloonType.getName());
            case BMW:
                return new BmwSaloon(saloonType.getName());
            default:
                throw new RuntimeException("没有你需要的轿车");
        }
    }

    public static Saloon createSaloonIfElse(SaloonType saloonType) {


        // if else if 实现
        if (saloonType == SaloonType.Audi) {
            return new AudiSaloon(saloonType.getName());
        } else if (saloonType == SaloonType.BMW) {
            return new BmwSaloon(saloonType.getName());
        } else {
            throw new RuntimeException("没有你需要的轿车");
        }

    }

    /**
     * 通过实现反射原理创建轿车，虽然可以实现
     * 缺陷还是挺明显的维护成本是挺高的
     */

    public static Saloon createSaloonReflect(SaloonType saloonType) {
        if (saloonType == null) {
            throw new RuntimeException("轿车类不能为空");
        }
        try {
            Class<?> forName = Class.forName(saloonType.getClassName());
            for (Constructor<?> constructor : forName.getConstructors()) {
                if (constructor.getParameterCount() == 1) {
                    Object saloon = constructor.newInstance(saloonType.getClassName());
                    if (saloon instanceof Saloon) {
                        return (Saloon) saloon;
                    }

                    throw new RuntimeException("加载对象不是轿车类");
                }
            }

            throw new RuntimeException("无法加载轿车类");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException("找不到加载的轿车类");
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {

            throw new RuntimeException("轿车类名配置失败");
        }
    }
}
