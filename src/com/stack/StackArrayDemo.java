package com.stack;


public class StackArrayDemo {

    public static void main(String[] args) throws Exception {

        StackArray sa = new StackArray( 5);

        sa.Push(5);
        sa.Push(12);
        sa.Push(51);
        sa.Push(511);
        sa.Push(225);

        sa.PrintElements();
        sa.Pop();
        sa.PrintElements();


    }


}
