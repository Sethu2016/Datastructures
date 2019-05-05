package com.stack;


public class StackDynamicArrayDemo {

    public static void main(String[] args) throws Exception {

        StackDynamicArray sa = new StackDynamicArray( 5);

        sa.Push(5);
        sa.Push(12);
        sa.Push(51);
        sa.Push(511);
        sa.Push(225);

        sa.Push(51);
        sa.Push(511);
        sa.Push(225);

        sa.PrintElements();
        sa.Pop();
        sa.PrintElements();

        sa.Push(51);
        sa.Push(511);
        sa.Push(225);
        sa.PrintElements();
    }


}
