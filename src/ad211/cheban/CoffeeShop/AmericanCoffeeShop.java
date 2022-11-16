package ad211.cheban.CoffeeShop;
import ad211.cheban.AmericanStyle.AmericanStyleAmericano;
import ad211.cheban.AmericanStyle.AmericanStyleCaffeLatte;
import ad211.cheban.AmericanStyle.AmericanStyleCappuccino;
import ad211.cheban.AmericanStyle.AmericanStyleEspresso;
import ad211.cheban.AmericanStyle.AmericanStyleAmericano;
import ad211.cheban.AmericanStyle.AmericanStyleCappuccino;
import ad211.cheban.AmericanStyle.AmericanStyleCaffeLatte;
import ad211.cheban.Coffee;
import ad211.cheban.CoffeeType;

public class AmericanCoffeeShop extends CoffeeShop {
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case AMERICANO:
                coffee = new AmericanStyleAmericano();
                break;
            case ESPRESSO:
                coffee = new AmericanStyleEspresso();
                break;
            case CAPPUCCINO:
                coffee = new AmericanStyleCappuccino();
                break;
            case CAFFE_LATTE:
                coffee = new AmericanStyleCaffeLatte();
                break;
        }

        return coffee;
    }
}