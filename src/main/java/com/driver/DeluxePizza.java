package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        //will called parent constructor
        // your code goes here
        // below methods are by defaults becouse its deluxe pizza
        addExtraCheese();
        addExtraToppings();
    }
}