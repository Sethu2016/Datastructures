package com.queue;


public class QueueDynamicArrayDemo {

    public static void main(String[] args) {

        QueueDynamicArray queue = new QueueDynamicArray(2);

        queue.Dequeue();
        queue.GetSize();
        queue.Enqueue("sethu1");
        queue.Enqueue("sethu2");
        queue.Enqueue("sethu3");
        queue.GetSize();
        queue.Enqueue("sethu4");
        queue.Enqueue("sethu5");

        queue.Dequeue();
        queue.Dequeue();
    }

}
