/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.foodcomparison;

/**
 *
 * @author amedv
 */
public class FoodProduct implements Comparable<FoodProduct> {

    //vars
    String name;
    double price;
    int healthIndex;
    
    //constructor

    public FoodProduct(String name, double price, int healthIndex) {
        this.name = name;
        this.price = price;
        this.healthIndex = healthIndex;
    }
    
    //ovverriding compareTo method to compare healthIndex
    //return 0 if equal, 1 if greater, -1 if less
    @Override
    public int compareTo(FoodProduct o) {
        if (this.healthIndex == o.healthIndex) {
            return 0;
        } else if (this.healthIndex > o.healthIndex) {
            return 1;
        } else {
            return -1;
        }
    }
    
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHealthIndex() {
        return healthIndex;
    }

    public void setHealthIndex(int healthIndex) {
        this.healthIndex = healthIndex;
    }
    
    //toString
    @Override
    public String toString() {
        return "\nProduct name: " + name + "\nPrice: " + price + "\nhealthIndex: " + healthIndex;
    }
}
