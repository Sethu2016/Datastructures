package com.stack;

import com.practice.Node;


public class StackLinkedList {
    Node top;
    public StackLinkedList(){
        this.top = null;
    }

    public void Push(Object item){

        Node nodeItem = new Node(item);

        if(top == null){
            top = nodeItem;
        }
        else{
            nodeItem.next = top;
            top = nodeItem;
        }
    }

    public void Pop(){

        if(top == null){
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Popped item is " + top.value.toString());
        top = top.next;


    }

    public void PrintList(){

        Node current = top;
        while (current != null){
            System.out.println(current.value.toString());
            current = current.next;
        }
    }
}
