package abstractFactory.factory;


import abstractFactory.SaloonType;
import abstractFactory.bean.AudiSaloon;
import abstractFactory.bean.AudiTruck;
import abstractFactory.bean.Saloon;
import abstractFactory.bean.Truck;

public class AudiFactory extends VehicleFactory {
    @Override
    public Saloon createSaloon() {
        return new AudiSaloon(SaloonType.AudiSaloon.getName());
    }

    @Override
    public Truck createTruck() {
        return new AudiTruck();
    }
}
