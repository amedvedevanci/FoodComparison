/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.foodcomparison;

/**
 *
 * @author amedv
 */
public class FoodProductTree extends GenericBT<FoodProduct> {
    public static void main(String[] args) {
        //creating food product instances
        FoodProduct coffee = new FoodProduct("Coffee", 5.41, 5);
        FoodProduct celery = new FoodProduct("Celery", 0.79, 2);
        FoodProduct fries = new FoodProduct("Fries", 3.50, 10);
        FoodProduct burger = new FoodProduct("Burger",6.50,10);
        FoodProduct cucumber = new FoodProduct("Cucumber",0.89,2);
        FoodProduct chicken = new FoodProduct("Chicken",4.50,6);
        FoodProduct orange = new FoodProduct("Orange",1.50,3);
        FoodProduct pasta = new FoodProduct("Pasta",1.10,7);
        FoodProduct rice = new FoodProduct("Rice",1.10,4);
        FoodProduct clonakilty = new FoodProduct("Clonakilty Black Pudding",1.50,1);
        
        //Creating BT
        FoodProductTree dinner = new FoodProductTree();
        System.out.println("Created new Food Products Tree");
        System.out.println("Is it empty? Expected: true; Actual: "+ dinner.isEmpty());
        System.out.println("Size of the tree. Expected: 0; Actual: "+dinner.size());
        System.out.println("At the root: "+dinner.getRoot());
        //System.out.println("Best: "+dinner.findBest());
        
        dinner.insertNode(coffee); //6
        System.out.println("********************************");
        System.out.println("Coffee is at the root of all evil... or all creativity");
        System.out.println("Is it empty? Expected: false; Actual: " + dinner.isEmpty());
        System.out.println("Size of the tree. Expected: 1; Actual: " + dinner.size());
        System.out.println("At the root: " + dinner.getRoot());
        System.out.println("Healthiest thing in the list. Expected: Coffee Actual:\n" + dinner.findBest());
        
        /*
                             Coffee
                Orange                   Pasta
         */
        
        dinner.insertNode(orange); //3
        dinner.insertNode(pasta); //7
        System.out.println("********************************");
        System.out.println("Adding orange and pasta");
        System.out.println("Is it empty? Expected: false; Actual: " + dinner.isEmpty());
        System.out.println("Size of the tree. Expected: 3; Actual: " + dinner.size());
        System.out.println("At the root: " + dinner.getRoot());
        System.out.println("\nHealthiest thing in the list. Expected: Orange Actual:\n" + dinner.findBest());
        System.out.println("\nUnhealthiest thing in the list. Expected: Pasta Actual:\n" + dinner.findWorst());
        
        
        /*
                             Coffee
                Orange                   Pasta
        
        Celery         Rice    Chicken          Fries
         */
        dinner.insertNode(celery);
        dinner.insertNode(rice);
        dinner.insertNode(chicken);
        dinner.insertNode(fries);
        System.out.println("********************************");
        System.out.println("Adding celery, rice, chicken, fries");
        System.out.println("Is it empty? Expected: false; Actual: " + dinner.isEmpty());
        System.out.println("Size of the tree. Expected: 7; Actual: " + dinner.size());
        System.out.println("At the root: " + dinner.getRoot());
        System.out.println("\nHealthiest thing in the list. Expected: Celery Actual:\n" + dinner.findBest());
        System.out.println("\nUnhealthiest thing in the list. Expected: Fries Actual:\n" + dinner.findWorst());
        
        /*
                             Coffee
                Orange                   Pasta
        
        Celery         Rice    Chicken          Fries
        
Black Pudding   Cucumber                            Burger
         */
        dinner.insertNode(clonakilty);
        dinner.insertNode(cucumber);
        dinner.insertNode(burger);
        System.out.println("********************************");
        System.out.println("Adding black pudding, cucumber, burger");
        System.out.println("Is it empty? Expected: false; Actual: " + dinner.isEmpty());
        System.out.println("Size of the tree. Expected: 10; Actual: " + dinner.size());
        System.out.println("At the root: " + dinner.getRoot());
        System.out.println("\nHealthiest thing in the list. Expected: black pudding Actual:\n" + dinner.findBest());
        System.out.println("\nUnhealthiest thing in the list. Expected: burger Actual:\n" + dinner.findWorst());
        
    }
}
