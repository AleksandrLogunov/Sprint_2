package ru.yandex.praktikum.service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double getTotalSumWithoutDiscount() {
        double sum = 0;
        for (Food i : products) {
            sum += i.getPrice() * i.getAmount();
        }
        return sum;
    }

    public double getTotalSumWithDiscount() {
        double sum = 0;
        for (Food i : products) {
           double discount = i.getDiscount();
           double priceAfterDiscount = i.getAmount()*i.getPrice()*(1-discount);
           sum += priceAfterDiscount;
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
