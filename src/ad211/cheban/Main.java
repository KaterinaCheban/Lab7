package ad211.cheban;
// импортируем нужные папки с классами
import ad211.cheban.CoffeeShop.AmericanCoffeeShop;
import ad211.cheban.CoffeeShop.CoffeeShop;
import ad211.cheban.CoffeeShop.ItalianCoffeeShop;
import ad211.cheban.CoffeeShop.SpaceCoffeeShop;
// выводим результаты
public class Main {
    public static void main(String[] args) {
        CoffeeShop italianCoffeeShop = new ItalianCoffeeShop();
        italianCoffeeShop.orderCoffee(CoffeeType.CAFFE_LATTE);

        CoffeeShop americanCoffeeShop = new AmericanCoffeeShop();
        americanCoffeeShop.orderCoffee(CoffeeType.AMERICANO);

        CoffeeShop spaceCoffeeShop = new SpaceCoffeeShop();
        spaceCoffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);
    }
}