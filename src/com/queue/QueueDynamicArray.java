package com.queue;

import java.util.Arrays;

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

    public void Enqueue(Object value){
        if(rear == size-1){
            int currentSize = array.length;
            int newSize = currentSize*2;

            array = Arrays.copyOf(array,newSize);
            size = newSize;
        }

        rear = rear +1;
        array[rear] = value;

        if(front == -1){
            front = front +1;
        }
    }

    public void Dequeue(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
            return;
        }
        Object out = array[front];
        front = front +1;
        System.out.println("Item dequeued:" + out.toString());
    }

    public int GetSize(){
        System.out.println("Array Size" + array.length);  return array.length;
    }
}
