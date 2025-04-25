package ru.yandex.praktikum.service;

import ru.yandex.praktikum.model.Discountable;
import ru.yandex.praktikum.model.Food;

import static ru.yandex.praktikum.model.constants.Discount.DISCOUNT_APPLE_RED;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double getTotalSumWithoutDiscount() {
        double sum = 0;
        for (Food i : products) {
            sum = sum + i.getPrice() * i.getAmount();
        }
        return sum;
    }

    public double getTotalSumWithDiscount() {
        double sum = 0;
        for (Food i : products) {
            if (i instanceof Discountable) {
                sum = sum + i.getAmount() * i.getPrice();
            } else {
                sum = sum + i.getAmount() * i.getPrice() * DISCOUNT_APPLE_RED;
            }
        }
        return sum;
    }

    public double getTotalVegWithoutDiscount() {
        double sum = 0;
        for (Food i : products) {
            if (i.isVegetarian()) {
                sum = sum + i.getPrice() * i.getAmount();
            }
        }
        return sum;
    }
}
