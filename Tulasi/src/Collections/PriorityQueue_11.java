package Collections;

import java.util.PriorityQueue;

// Write a Java program to convert a Priority Queue elements to a string representation.
public class PriorityQueue_11 {
    public static void main(String[] args) {
        PriorityQueue<String> p_queue= new PriorityQueue<>();
        p_queue.add("Red");
        p_queue.add("Blue");
        p_queue.add("White");
        p_queue.add("Green");
        p_queue.add("Pink");
        p_queue.add("Yellow");
        System.out.println("Original PriorityQueue elements- \n"+p_queue);
        String Str=p_queue.toString();
        System.out.println("Convert a Priority Queue elements to a string representation-\n"+Str);
    }
}
