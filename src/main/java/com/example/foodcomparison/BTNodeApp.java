/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.foodcomparison;

/**
 * App class to test BTNode
 */
public class BTNodeApp {
    public static void main(String[] args) {
        
        //creating food product instances
        FoodProduct coffee = new FoodProduct("Coffee",5.41,6);
        FoodProduct celery = new FoodProduct("Celery",0.79,2);
        FoodProduct fries = new FoodProduct("Fries",3.50,10);
        System.out.println("Created food products:");
        System.out.println(coffee.toString());
        System.out.println(celery.toString());
        System.out.println(fries.toString());
        
        //adding food product instances to BTNodes
        BTNode<FoodProduct> coffeeNode = new BTNode<>(coffee);
        BTNode<FoodProduct> celeryNode = new BTNode<>(celery);
        BTNode<FoodProduct> friesNode = new BTNode<>(fries);
        
        //linking BTNodes
        coffeeNode.left=celeryNode;
        coffeeNode.right=friesNode;
        System.out.println("********************************");
        System.out.println("Linked nodes: ");
        System.out.println(coffeeNode.toString());
        
        //checking that variables can be accessed
        System.out.println("********************************");
        double totalPrice = coffeeNode.element.getPrice()+celeryNode.element.getPrice()+friesNode.element.getPrice();
        System.out.println("Total price: "+totalPrice);
        System.out.println("Expected: 9.7");
        
        double avgIndex = (coffeeNode.element.getHealthIndex()+celeryNode.element.getHealthIndex()+friesNode.element.getHealthIndex())/3;
        System.out.println("Average health index: "+avgIndex);
        System.out.println("Expected: 6");
        
        //testing compareTo method
        System.out.println("********************************");
        System.out.println("Testing compareTo method");
        System.out.println("Compare fries with celery:");
        
        if(fries.compareTo(celery)<0){
            System.out.println("Fries are more healthy than celery");
        }
        else if(fries.compareTo(celery)>0){
            System.out.println("Fries are less healthy than celery");
        }
        else{
            System.out.println("What is even the difference between fries and celery");
        }
        
        FoodProduct burger = new FoodProduct("Burger",6.50,10);
        if (fries.compareTo(burger) < 0) {
            System.out.println("Fries are more healthy than burgers");
        } else if (fries.compareTo(burger) > 0) {
            System.out.println("Fries are less healthy than burgers");
        } else {
            System.out.println("Burgers and fries are as good as each other");
        }
    }
}
