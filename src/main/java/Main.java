import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.service.ShoppingCart;

public class Main {
    public static void main(String[] args){
        Food meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.APPLE_RED);
        Apple greenApple = new Apple(8, 60, Colour.APPLE_GREEN);

        Food[] products = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(products);

        System.out.println("Сумма товаров без скидки: "+ shoppingCart.getTotalSumWithoutDiscount());
        System.out.println("Сумма товаров со скидкой: "+ shoppingCart.getTotalSumWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки.: "+ shoppingCart.getTotalVegWithoutDiscount());
    }
}
