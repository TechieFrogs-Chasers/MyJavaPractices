package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

//Write a Java program to convert a priority queue to an array containing all of the elements of the queue.
public class PriorityQueue_10 {
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

        List<Integer> arr_queue=new ArrayList<Integer>(p_queue);
        System.out.println("Array containing all of the elements of the queue-\n"+p_queue);
    }
}
