package Collections;

import java.util.PriorityQueue;

//Write a Java program to change priorityQueue to maximum priorityqueue.
public class PriorityQueue_12 {
    public static void main(String[] args) {
        PriorityQueue<Integer> p_queue = new PriorityQueue<>();
        p_queue.add(88);
        p_queue.add(23);
        p_queue.add(77);
        p_queue.add(45);
        p_queue.add(66);
        p_queue.add(11);
        p_queue.add(94);
        System.out.println("Original PriorityQueue elements-\n " + p_queue);
        System.out.print("\nMaximum Priority Queue: ");
        Integer val = null;
        while( (val = p_queue.poll()) != null) {
            System.out.print(val+"  ");
        }
        System.out.print("\n");
    }
}