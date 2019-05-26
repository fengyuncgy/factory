package methodFactory.factory;

import methodFactory.SaloonType;
import methodFactory.bean.BmwSaloon;
import methodFactory.bean.Saloon;

public class BmwSaloonFactory extends SaloonFactory {
    @Override
   public Saloon createSaloon() {
        return new BmwSaloon(SaloonType.BMW.getName());
    }
}
