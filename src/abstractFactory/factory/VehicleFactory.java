package abstractFactory.factory;

import abstractFactory.bean.Saloon;
import abstractFactory.bean.Truck;

/**
 * 造车工厂
 */
public abstract class VehicleFactory {

    public abstract Saloon createSaloon();
    public abstract Truck createTruck();
}
