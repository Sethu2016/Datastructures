package com.queue;

public class QueueArray {


    private int _size;
    int front;
    int rear;

    Object[] array;

    public QueueArray(int size) {
        _size = size;
        front = -1;
        rear = -1;
        array = new Object[size];
    }

    public void Enqueue(Object value){
        if(rear == _size-1){
            System.out.println("Queue is full");
            return;
        }

        rear = rear+1;
        array[rear] = value;

        //only for first element
        if(front == -1){
            front = 0;
        }
    }

    public void Dequeue(){
        if(front> rear || front == -1){
            System.out.println("Queue is empty");
            return;
        }

        Object value = array[front];

        front = front + 1;
        System.out.println("Item removed: " + value.toString());


    }
}
