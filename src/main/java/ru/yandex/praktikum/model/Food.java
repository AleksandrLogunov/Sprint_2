package ru.yandex.praktikum.model;

import static ru.yandex.praktikum.model.constants.Discount.DISCOUNT_DEFAULT;


public abstract class Food implements Discountable{
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    protected Food(int amount, double price, boolean isVegetarian){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }
    @Override
    public double getDiscount() {
        return DISCOUNT_DEFAULT;
    }

public int getAmount(){

        return amount;
}

public double getPrice(){
        return price;
}

public boolean isVegetarian(){
        return isVegetarian;
}

}
