/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.foodcomparison;

/**
 *
 * @author amedv
 */
public class GenericBT<T extends Comparable <T>> implements BinaryTreeInterface<T> {

    //vars
    private BTNode<T> root;

    //isEmpty
    @Override
    public boolean isEmpty() {
        //check if root is null. If it is, binary tree is empty, thus return true.
        return root==null;
    }

    //size method
    @Override
    public int size() {
        return size(root);
    }

    //insert a new node into its correct place in the tree
    @Override
    public void insertNode(T element) {
        //if the tree is empty, set the root element to the element that was passed in
        if(isEmpty()){
            root = new BTNode<>(element);
        }
        //otherwise, recurse from root until the correct placement is found
        else{
            insertNode(element,root);
        }
    }

    @Override
    public T findBest() {
        //throw an Empty Tree Exception if the tree is empty
        if (isEmpty()) {
            throw new EmptyTreeException();
        } //otherwise, pass in the root to start finding the minimum/leftmost value
        else {
            return findBest(root);
        }
    }

    @Override
    public T findWorst() {
        //throw an Empty Tree Exception if the tree is empty
        if (isEmpty()) {
            throw new EmptyTreeException();
        } //otherwise, pass in the root to start finding the maximum/rightmost value
        else {
            return findWorst(root);
        }
    }

    //size helper method
    private int size(BTNode<T> current) {
        //if the root element that has been passed in is empty, return 0
        if(current==null){
            return 0;
        }
        else{
            //otherwise, recursively call the method along the left and right branches
            //+1 for current
            return 1+size(current.left)+size(current.right);
        }
    }

    //insert helper method
    private void insertNode(T element, BTNode<T> current) {
        //the eleemnt to be passed in is smaller than the element at the current position
        if(element.compareTo(current.element)<0){
            //if there is no node to the left, create a new node with the element that was passed in
            if (current.left==null) {
                current.left = new BTNode<>(element);
            }
            //otherwise, recurse down the tree until the correct placement is found
            else{
                insertNode(element,current.left);
            }
        }
        //if the element that eas passed in is greater OR EQUAL to the current element, go right
        else{
            //if there is no node to the right, create a new node with the element that was passed in
            if(current.right==null){
                current.right = new BTNode<>(element);
            }
            //otherwise, recurse down the tree until the correct placement is found
            else {
                insertNode(element, current.right);
            }
        }
    }

    //findBest helper method
    private T findBest(BTNode<T> current) {
        //if there are no further elements to the left, min has been found
        if (current.left == null) {
            return current.element;
        } 
        //otherwise, recurse until the leftmost element is found
        else {
            return findBest(current.left);
        }
    }

    //findWorst helper method
    private T findWorst(BTNode<T> current) {
        //if there are no further elements to the right, max has been found
        if (current.right == null) {
            return current.element;
        } 
        //otherwise, recurse until the rightmost element is found
        else {
            return findWorst(current.right);
        }
    }
    
    //getter

    public BTNode<T> getRoot() {
        return root;
    }
    
    
}
