package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Collections;

//Print odd and even numbers in ArrayList?
public class Assignment_44 {
    public static void main(String[] args) {
        int[] num={1,5,3,4,2,8,6,7,10,19,55,76,88,44,22,33,11,79};
        ArrayList<Integer> oddnum = new ArrayList<>();
        ArrayList<Integer> evennum = new ArrayList<>();

        for (int i=0;i<num.length;i++){
            if(num[i]%2==0) {
                evennum.add(num[i]);
            }else {
                oddnum.add(num[i]);
            }
        }
        Collections.sort(evennum);
        Collections.sort(oddnum);
        for (int even:evennum);
        System.out.println("Even numbers in ArrayList: "+evennum+" ,");
        for(int odd:oddnum);
        System.out.println("Odd numbers in ArrayList: "+oddnum+",");

    }
}
