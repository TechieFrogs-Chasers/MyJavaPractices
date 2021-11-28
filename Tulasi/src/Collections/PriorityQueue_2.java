package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

//Write a Java program to iterate through all elements in priority queue.
public class PriorityQueue_2 {
    public static void main(String[] args) {
        PriorityQueue<String> p_queue = new PriorityQueue<>();
        p_queue.add("Red");
        p_queue.add("Blue");
        p_queue.add("White");
        p_queue.add("Green");
        p_queue.add("Pink");
        p_queue.add("Yellow");

       for(String queue:p_queue){
            System.out.println(queue);
        }
    }
}
