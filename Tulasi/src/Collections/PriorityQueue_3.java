package Collections;

import java.util.PriorityQueue;

//Write a Java program to add all the elements of a priority queue to another priority queue.
public class PriorityQueue_3 {
    public static void main(String[] args) {
        PriorityQueue<String> p_queue = new PriorityQueue<>();
        p_queue.add("Red");
        p_queue.add("Blue");
        p_queue.add("White");
        p_queue.add("Green");
        p_queue.add("Pink");
        p_queue.add("Yellow");
        System.out.println("PriorityQueue elements- \n"+p_queue);

        PriorityQueue<String> p_queue1 = new PriorityQueue<>();
        p_queue1.add("Dark");
        p_queue1.add("Moon");
        p_queue1.add("Light");
        p_queue1.add("Black");
        p_queue1.add("Night");
        p_queue1.add("Star");
        System.out.println("PriorityQueue1 elements- \n"+p_queue1);

        p_queue.addAll(p_queue1);
        System.out.println("After adding PriorityQueue and PriorityQueue1 elements-\n"+p_queue);

    }
}
