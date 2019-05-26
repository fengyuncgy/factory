package abstractFactory.factory;

import abstractFactory.SaloonType;
import abstractFactory.bean.*;

public class BmwFactory extends VehicleFactory {
    @Override
    public Saloon createSaloon() {
        return new BmwSaloon(SaloonType.BMWSaloon.getName());
    }

    @Override
    public Truck createTruck() {
        return new BmwTruck();
    }
}
