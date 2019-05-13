package com.array;

public class ReverseArrayDemo {

    public static void main(String[] args) {
        ReverseArray revArray = new ReverseArray();
        revArray.Reverse( new Object[]{1,2,3,4,5}, 0, 4);
        System.out.println("----------RotateRight------");
        revArray.RotateRight(new Object[]{1,2,3,4,5},3);

        System.out.println("----------Rotateleft------");
        revArray.RotateLeft(new Object[]{1,2,3,4,5,6,7},2);
    }
}
