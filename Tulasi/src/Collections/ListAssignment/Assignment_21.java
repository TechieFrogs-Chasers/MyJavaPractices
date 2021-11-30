package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//21.WAP to add user-class to Array List or Vector or Linked List?
public class Assignment_21 {
    public static void main(String[] args) {
        UserClass userClass=new UserClass("Kim","Atlanta",444);
        UserClass userClass1=new UserClass("Jim","NY",555);
        UserClass userClass2=new UserClass("Don","WI",666);
        UserClass userClass3=new UserClass("Mike","IL",777);
        UserClass userClass4=new UserClass("Tom","NY",888);
        UserClass userClass5=new UserClass("Jerry","CA",999);

        List<UserClass> l=new ArrayList<>();
        l.add(userClass);
        l.add(userClass1);
        l.add(userClass2);
        l.add(userClass3);
        l.add(userClass4);
        l.add(userClass5);
        System.out.println("Adding user-class to Array List-");
        for(UserClass user:l)
        System.out.println(user);
        System.out.println();

        List<UserClass> v=new Vector<>();
        v.add(userClass);
        v.add(userClass1);
        v.add(userClass2);
        v.add(userClass3);
        v.add(userClass4);
        v.add(userClass5);
        System.out.println("Adding user-class to Vector-");
        for(UserClass users:v)
            System.out.println(users);
        System.out.println();

        List<UserClass> ll=new LinkedList<>();
        ll.add(userClass);
        ll.add(userClass1);
        ll.add(userClass2);
        ll.add(userClass3);
        ll.add(userClass4);
        ll.add(userClass5);
        System.out.println("Adding user-class to Linked List-");
        for(UserClass use:ll)
            System.out.println(use);

    }
}
