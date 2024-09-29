/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.foodcomparison;

/**
	Interfaces allow us to make sure a number of methods need to be implemented when implementing the Interface. 
        * Write a suitable interface for a Binary Tree that will ensure that only trees of comparable objects can be constructed. 
        *
        * You should provide methods to:
        
1.	Check if the tree is empty
2.	To add Nodes into the tree
3.	To count all the Nodes
4.	Find the best Food Product object (lowest rating)
5.	Find the worst Food Product object (highest rating)

 */
public interface BinaryTreeInterface<T extends Comparable<T>> {
    //defining the interface 

    //check if the tree is empty, return boolean value
    public boolean isEmpty();

    //check the number of elements in the tree, return integer value
    public int size();

    //insert new node
    public void insertNode(T element);
      
    //find best item / lowest (or leftmost) Node
    public T findBest();

    //find worst item / highest (or rightmost) Node
    public T findWorst();

}
