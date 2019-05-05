package com.queue;

public class QueueDynamicArray {
    private int size;

    Object[] array;
    int front;
    int rear;
    public QueueDynamicArray(int size){

        this.size = size;
        array = new Object[size];
        front = -1;
        rear = -1;

    }
}
