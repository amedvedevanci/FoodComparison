/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.foodcomparison;

/**
 *	Define a suitable BTNode for a Binary Tree using Java Generics.
 */
public class BTNode<T> {
    
    //vars
    protected T element;
    protected BTNode<T> left;
    protected BTNode<T> right;

    //constructor
    public BTNode(T element) {
        this.element = element;
    }

    public BTNode(T element, BTNode<T> left, BTNode<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }
    
    //toString method
    public String toString() {
        String leftVal = "", rightVal = "";

        //more verbose version for clarity
        //recurse through the BTNodes until the leftmost node is reached
        if (left == null) {
            leftVal = "NULL";
        } else {
            leftVal = left.toString();
        }

        //recurse through the BTNodes until the rightmost node is reached
        if (right == null) {
            rightVal = "NULL\n____________";
        } else {
            rightVal = right.toString();
        }

        //return resultstring
        return "\nElement: " + element + "\nLeft: " + leftVal + "\nRight: " + rightVal;
    }
}
