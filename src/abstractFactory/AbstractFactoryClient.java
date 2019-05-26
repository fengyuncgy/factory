package abstractFactory;

import abstractFactory.bean.Truck;
import abstractFactory.factory.AudiFactory;
import abstractFactory.factory.BmwFactory;
import abstractFactory.factory.VehicleFactory;

public class AbstractFactoryClient {

    public static void main(String [] args){
        VehicleFactory bmwFactory = new BmwFactory();
        bmwFactory.createSaloon().run();
        bmwFactory.createTruck().run();

        VehicleFactory audiFactory = new AudiFactory();
        audiFactory.createTruck().run();
        audiFactory.createSaloon().run();
    }
}
