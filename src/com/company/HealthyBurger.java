package com.company;

public class HealthyBurger extends BaseBurger {
    private Addition addition5;
    private Addition addition6;


    public HealthyBurger(String meat) {
        super("Healthy Burger", "brown rye bread roll", meat, 2.05, 0);
    }


    @Override
    public double getFinalPrice() {
        return super.getFinalPrice();
    }

    @Override
    public void addAddition(String name, double price) {

        if (super.getAdditionCount() >= 0 && super.getAdditionCount() < 4) {
            super.addAddition(name, price);
        } else {
            addToPrice(price);
            super.setAdditionCount();
            switch (super.getAdditionCount()) {
                case 5:
                    addition5 = new Addition(name, price);
                    break;
                case 6:
                    addition6 = new Addition(name, price);
                    break;
            }
        }

    }


}
