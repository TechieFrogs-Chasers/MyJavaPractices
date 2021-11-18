package Practices;

import java.util.*;
import java.util.ArrayList;

public class Collection_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> ali = new ArrayList<Integer>();
        ArrayList<String> als = new ArrayList<String>();
        LinkedList<String> lss = new LinkedList<String>();
        Vector<String> vs = new Vector<String>();
        Stack<String> stack = new Stack<String>();
        HashSet<String> set = new HashSet<String>();
        Deque<String> deque = new ArrayDeque<String>();

        ali.add(15);//Adding object in arraylist
        als.add("Ravi");
        als.add("Vijay");
        als.add("Anu");
        als.add("Ajay");

        lss.add("Ravi");//Adding object in linklist
        lss.add("Vijay");
        lss.add("Anu");
        lss.add("Ajay");

        vs.add("Ayush");//Adding object in Vector
        vs.add("Amit");
        vs.add("Ashish");
        vs.add("Garima");

        stack.push("Ayush");//Adding object in Stack
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");

        set.add("Ravi");//Adding object in Set
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        deque.add("Gautam");//Adding object in deque
        deque.add("Karan");
        deque.add("Ajay");

        Iterator itr = als.iterator();
        Iterator itr2 = lss.iterator();
        Iterator itr3 = vs.iterator();
        Iterator itr4 = stack.iterator();
        Iterator itr5 = set.iterator();
        Iterator itr6 = ali.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            System.out.println(itr2.next());
            System.out.println(itr3.next());
            System.out.println(itr4.next());
            System.out.println(itr5.next());
            System.out.println(itr6.next());
            for (String str : deque) {
                System.out.println(str);
            }
        }
    }
}




