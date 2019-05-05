package com.queue;


public class QueueArrayDemo {

    public static void main(String[] args) {

        QueueArray queue = new QueueArray(4);

        queue.Dequeue();
        queue.Enqueue("sethu1");
        queue.Enqueue("sethu2");
        queue.Enqueue("sethu3");
        queue.Enqueue("sethu4");
        queue.Enqueue("sethu5");

        queue.Dequeue();
        queue.Dequeue();
    }

}
