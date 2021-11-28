package Collections;

import java.util.PriorityQueue;

// Write a Java program to retrieve and remove the first element.
public class PriorityQueue_9 {
    public static void main(String[] args) {
        PriorityQueue <Integer> p_queue=new PriorityQueue<>();
        p_queue.add(88);
        p_queue.add(23);
        p_queue.add(77);
        p_queue.add(45);
        p_queue.add(66);
        p_queue.add(11);
        p_queue.add(94);
        System.out.println("Original PriorityQueue elements-\n "+ p_queue);
        p_queue.poll();//to remove first element use poll() mehtod
        System.out.println(p_queue);
    }
}
