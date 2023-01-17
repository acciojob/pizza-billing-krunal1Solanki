package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheese;
    private int extreToppings;
    private int bag;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        this.price += extraCheese;
    }

    public void addExtraToppings(){
        // your code goes here
        this.price += extreToppings;
    }

    public void addTakeaway(){
        // your code goes here
        this.price += bag;
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
