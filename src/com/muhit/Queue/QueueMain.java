                //FIRST IN FIRST OUT

package com.muhit.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(25);
        queue.insert(65);
        queue.insert(35);
        queue.insert(15);
        queue.insert(85);
        queue.insert(75);

        queue.display();

    }
}
