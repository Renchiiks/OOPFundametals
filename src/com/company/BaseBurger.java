package com.company;

public class BaseBurger {
    private String name;
    private String breadRoll;
    private String meat;
    private double basePrice;
    private double finalPrice;

    private int additionCount = 0;
    private double priceForAdditions;

    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public BaseBurger(String breadRoll, String meat) {
        this.name = "Base Burger";
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basePrice = 1.5;

    }

    public BaseBurger(String name, String breadRoll, String meat, double basePrice, int additionCount) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basePrice = basePrice;
        this.additionCount = additionCount;

    }

    public String getName() {
        return name;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getFinalPrice() {
        return Math.round(setFinalPrice() * 100.00) / 100.00;
    }

    public int getAdditionCount() {
        return additionCount;
    }

    public Addition getAddition1() {
        return addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    public void setAdditionCount() {
        this.additionCount++;
    }

    public double setFinalPrice() {
        return this.finalPrice = this.basePrice + this.priceForAdditions;
    }

    public void addAddition(String name, double price) {

        Addition addition = new Addition(name, price);
        this.additionCount++;

        if (this.additionCount <= 4) {
            addToPrice(price);
            switch (this.additionCount) {
                case 1:
                    addition1 = addition;
                    break;
                case 2:
                    addition2 = addition;
                    break;
                case 3:
                    addition3 = addition;
                    break;
                case 4:
                    addition4 = addition;
                    break;
                default:
                    addition = null;
            }
        }
    }

    public double addToPrice(double price) {
        return this.priceForAdditions += price;
    }
}
