package com.stack;

import java.lang.reflect.Array;

public class StackArray {

    int _size;
    Object[] _array;
    int  _top;
    public StackArray(int size){
        _size= size;
        _array = new Object[size];
        _top = -1;
    }

    public void Push(Object value){

        if(_top == _size-1){
            throw new StackOverflowError("cannot push to stack");
        }
        _top = _top +1;
        _array[_top] =  value;
    }

    public void Pop() throws Exception {

        if(_top == -1){
            throw new Exception("Stack is empty cannot pop");
        }
         _array[_top] = null;
        _top = _top -1;
    }

    public void PrintElements(){

        for ( Object item : _array) {

            if(item != null)
            System.out.println("Item:"+ item.toString());

        }
    }
}
