package ad211.cheban.CoffeeShop;

import ad211.cheban.Coffee;
import ad211.cheban.CoffeeType;

public abstract class CoffeeShop {
// обрабатываем заказ кофе
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);

        coffee.makeCoffee();
        coffee.pourIntoCup();
        coffee.paintCoffee();

        System.out.println("Вот ваш кофе! Спасибо, приходите еще!");
        return coffee;
    }

    protected abstract Coffee createCoffee(CoffeeType type);
}
