package com.stack;

public class StackLinkedListDemo {

    public static void main(String[] args)  {

        StackLinkedList sa = new StackLinkedList();

        sa.Push(5);
        sa.Push(12);
        sa.Push(51);
        sa.Push(511);
        sa.Push(225);



        sa.PrintList();
        sa.Pop();
        sa.PrintList();

        sa.Push(51);
        sa.Push("sethu");
        sa.Push(225);
        sa.PrintList();
    }
}
