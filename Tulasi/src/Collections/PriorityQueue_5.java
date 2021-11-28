package Collections;

import java.util.PriorityQueue;

//Write a Java program to remove all the elements from a priority queue.
public class PriorityQueue_5 {
    public static void main(String[] args) {
        PriorityQueue<String> p_queue= new PriorityQueue<>();
        p_queue.add("Red");
        p_queue.add("Blue");
        p_queue.add("White");
        p_queue.add("Green");
        p_queue.add("Pink");
        p_queue.add("Yellow");
        System.out.println("Original PriorityQueue elements- \n"+p_queue);
        p_queue.clear();
        System.out.println("After removeall elements -"+p_queue);
    }
}
