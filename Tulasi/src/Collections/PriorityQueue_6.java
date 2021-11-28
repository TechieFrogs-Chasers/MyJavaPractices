package Collections;

import java.util.PriorityQueue;

//Write a Java program to count the number of elements in a priority queue.
public class PriorityQueue_6 {
    public static void main(String[] args) {
        PriorityQueue<String> p_queue = new PriorityQueue<>();
        p_queue.add("Red");
        p_queue.add("Blue");
        p_queue.add("White");
        p_queue.add("Green");
        p_queue.add("Pink");
        p_queue.add("Yellow");
        System.out.println("PriorityQueue elements- \n" + p_queue);
        System.out.println("Count number of elements-"+(p_queue.size()));
    }
}