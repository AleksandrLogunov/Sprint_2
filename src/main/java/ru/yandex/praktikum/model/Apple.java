package ru.yandex.praktikum.model;


import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.model.constants.Discount;


public class Apple extends Food implements Discountable {
    private String color;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    @Override
    public double getDiscount(){
        return Colour.APPLE_RED.equals(color) ? Discount.DISCOUNT_APPLE_RED : 0;
        }
    }

