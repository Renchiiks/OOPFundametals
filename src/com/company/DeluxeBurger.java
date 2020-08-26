package com.company;

public class DeluxeBurger extends BaseBurger {
    private Addition drink;
    private Addition chips;

    public DeluxeBurger(String breadRoll, String meat) {
        super("Deluxe Burger", breadRoll, meat, 3.6, 0);
        this.drink = new Addition("Drink", 0.5);
        this.chips = new Addition("Chips", 0.5);

    }

    public Addition getDrink() {
        return drink;
    }

    public Addition getChips() {
        return chips;
    }

    @Override
    public double addToPrice(double price) {
        return super.addToPrice(price) + this.drink.getPrice()+ this.chips.getPrice();
    }
}
