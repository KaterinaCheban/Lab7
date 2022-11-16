package ad211.cheban.CoffeeShop;

import ad211.cheban.Coffee;
import ad211.cheban.CoffeeType;
import ad211.cheban.SpaceStyle.SpaceStyleAmericano;
import ad211.cheban.SpaceStyle.SpaceStyleCaffeLatte;
import ad211.cheban.SpaceStyle.SpaceStyleCappuccino;
import ad211.cheban.SpaceStyle.SpaceStyleEspresso;

public class SpaceCoffeeShop extends CoffeeShop {

    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new SpaceStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new SpaceStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new SpaceStyleCappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new SpaceStyleCaffeLatte();
                break;
        }
        return coffee;
    }
}
