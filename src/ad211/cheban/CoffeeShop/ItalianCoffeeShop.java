package ad211.cheban.CoffeeShop;

import ad211.cheban.Coffee;
import ad211.cheban.CoffeeShop.CoffeeShop;
import ad211.cheban.CoffeeType;
import ad211.cheban.ItalianStyle.ItalianStyleAmericano;
import ad211.cheban.ItalianStyle.ItalianStyleCaffeLatte;
import ad211.cheban.ItalianStyle.ItalianStyleCappuccino;
import ad211.cheban.ItalianStyle.ItalianStyleEspresso;

public class ItalianCoffeeShop extends CoffeeShop {

    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new ItalianStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new ItalianStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new ItalianStyleCappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new ItalianStyleCaffeLatte();
                break;
        }
        return coffee;
    }
}

