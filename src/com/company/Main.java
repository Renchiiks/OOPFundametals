package com.company;

public class Main {

    public static void main(String[] args) {
        BaseBurger baseBurger = new BaseBurger("white bread", "beef");
        baseBurger.addAddition(BaseBurger.class.getName() + "tomato", 0.3);
        baseBurger.addAddition(BaseBurger.class.getName()+"onion", 0.13);
        baseBurger.addAddition("cheese", 0.5);
        baseBurger.addAddition("cheese", 0.6);
        baseBurger.addAddition("cheese", 0.7);

        System.out.println(baseBurger.getAddition1().getPrice());
        System.out.println(baseBurger.getBasePrice());
        System.out.println(baseBurger.getFinalPrice());

        HealthyBurger healthyBurger = new HealthyBurger("beef");
        healthyBurger.addAddition("tomato", 0.3);
        healthyBurger.addAddition("onion", 0.13);
        healthyBurger.addAddition("cheese", 0.5);
        healthyBurger.addAddition("cheese", 0.6);
        healthyBurger.addAddition("cheese", 0.7);

        System.out.println(healthyBurger.getAddition2().getPrice());
        System.out.println(healthyBurger.getBasePrice());
        System.out.println(healthyBurger.getFinalPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger("white", "beef");
        System.out.println(deluxeBurger.getChips().getPrice());


    }
}
