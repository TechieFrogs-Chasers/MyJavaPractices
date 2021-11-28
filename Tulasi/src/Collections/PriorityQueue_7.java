package Collections;

import java.util.PriorityQueue;

//Write a Java program to compare two priority queues.
public class PriorityQueue_7 {
    public static void main(String[] args) {

        PriorityQueue<String> p_queue = new PriorityQueue<>();
        p_queue.add("Red");
        p_queue.add("Blue");
        p_queue.add("White");
        p_queue.add("Green");
        p_queue.add("Pink");
        p_queue.add("Yellow");
        System.out.println("PriorityQueue elements- \n" + p_queue);

        PriorityQueue<String> p_queue1 = new PriorityQueue<>();
        p_queue1.add("Red");
        p_queue1.add("Moon");
        p_queue1.add("Light");
        p_queue1.add("Green");
        p_queue1.add("Night");
        p_queue1.add("Yellow");
        System.out.println("PriorityQueue1 elements- \n" + p_queue1);

        for (String compare: p_queue){
            System.out.println(p_queue1.contains(compare)?"Yes":"No");
        }
    }
}