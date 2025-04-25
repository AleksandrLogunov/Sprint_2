package ru.yandex.praktikum.model;


import ru.yandex.praktikum.model.constants.Colour;
import static ru.yandex.praktikum.model.constants.Discount.DISCOUNT_APPLE_RED;

public class Apple extends Food implements Discountable {
    private String color;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    @Override
    public double getDiscount(){
        if(color == Colour.APPLE_RED){
            return DISCOUNT_APPLE_RED;
        } else {
            return 0;
        }
    }
}
