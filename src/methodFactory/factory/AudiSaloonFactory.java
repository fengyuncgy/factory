package methodFactory.factory;

import methodFactory.SaloonType;
import methodFactory.bean.BmwSaloon;
import methodFactory.bean.Saloon;

public class AudiSaloonFactory extends SaloonFactory {
    @Override
    public Saloon createSaloon() {
        return new BmwSaloon(SaloonType.Audi.getName());
    }
}
