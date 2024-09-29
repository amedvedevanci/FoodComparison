/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.foodcomparison;

/**
 * Exception to be thrown when trying to return an element of type T from an empty tree

 */
public class EmptyTreeException extends RuntimeException {

    public EmptyTreeException(){
        super("The tree is empty. Please add some elements");
    } 
}
