package com.queue;

import com.practice.Node;

public class QueueLinkedList {
    Node front;
    Node rear;
    public QueueLinkedList(){


        rear = null;
        front = null;
    }

    public void Enqueue(Object value){
        Node node = new Node(value);

        if(front == null || rear == null){
            front = node;
            rear = node;
        } else{

            rear.next = node;
            rear = node;
        }

    }


    public void Dequeue(){


        if(front == null || rear == null){
            System.out.println("Queue is empty");
            return;
        }

        Object value = front.value;
        front = front.next;
        System.out.println("Item dequeued" + value.toString());
    }
}
