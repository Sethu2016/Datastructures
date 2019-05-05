package com.stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StackDynamicArray {

    int _size;
    Object[] _array;
    int  _top;
    public StackDynamicArray(int size){
        _size= size;
        _array = new Object[size];
        _top = -1;
    }

    public void Push(Object value){

        Integer oldSize = _array.length;
        Integer newSize;
        if(_top == _size-1){
            newSize = oldSize*2;

            _array = Arrays.copyOf(_array,newSize);
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
