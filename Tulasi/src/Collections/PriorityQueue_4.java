package Collections;

import java.util.Collections;
import java.util.PriorityQueue;

//Write a Java program to insert a given element into a priority queue.
public class PriorityQueue_4 {
    public static void main(String[] args) {
        PriorityQueue<String> p_queue = new PriorityQueue<>();
        p_queue.add("Red");
        p_queue.add("Blue");
        p_queue.add("White");
        p_queue.add("Green");
        p_queue.add("Pink");
        p_queue.add("Yellow");
        System.out.println("PriorityQueue elements- \n" + p_queue);
        p_queue.offer("Black");
        System.out.println("After adding a given element into a priority queue -\n"+p_queue);

    }
}