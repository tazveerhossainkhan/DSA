package com.muhit.Queue;

public class CircularQueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue cq = new CircularQueue();
        cq.insert(3);
        cq.insert(6);
        cq.insert(5);
        cq.insert(19);
        cq.insert(1);
        cq.display();

        System.out.println(cq.remove());
        cq.insert(133);
        cq.display();

    }
}
