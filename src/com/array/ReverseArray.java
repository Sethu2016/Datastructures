package com.array;


public class ReverseArray {

    public ReverseArray(){

    }

    public Object[] Reverse(Object[] array, int Start, int End){
        //Integer Start = 0;
        //Integer End = array.length -1;

        while (Start < End) {

            Object temp = array[Start];
            array[Start] = array[End];
            array[End] = temp;

            Start++;
            End--;

        }

        for (Object item: array) {
            System.out.println(item.toString());
        }
return array;
    }

    public void  RotateRight(Object[] array, int numberOfTimes){
        int length = array.length;

        Reverse(array,0,length-numberOfTimes-1);
        System.out.println("---------------");
        Reverse(array, length-numberOfTimes , array.length -1);
        System.out.println("---------------");
        Reverse(array, 0, length-1);
    }


    public void RotateLeft(Object[] array, int rotations){
        int n = array.length;

        Reverse(array, 0,rotations-1);
        System.out.println("---------------");
        Reverse(array, rotations, n-1);
        System.out.println("---------------");
        Reverse(array,0,n-1);

    }

}
