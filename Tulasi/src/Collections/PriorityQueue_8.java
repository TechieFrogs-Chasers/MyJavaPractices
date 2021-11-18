package Collections;

import java.util.PriorityQueue;

//Write a Java program to retrieve the first element of the priority queue.
public class PriorityQueue_8 {
    public static void main(String[] args) {
        PriorityQueue<String> p_queue = new PriorityQueue<>();
        p_queue.add("Red");
        p_queue.add("Blue");
        p_queue.add("White");
        p_queue.add("Green");
        p_queue.add("Pink");
        p_queue.add("Yellow");
        System.out.println("PriorityQueue elements- \n" + p_queue);
        System.out.println("Retrieve first element-"+p_queue.peek());
        System.out.println("Elements-"+p_queue);
    }
}
