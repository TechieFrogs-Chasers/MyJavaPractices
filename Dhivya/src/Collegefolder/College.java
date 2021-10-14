package Collegefolder;

import university.UniversityHead;

public class College extends UniversityHead{
    public static void statMethod(){
        System.out.println("Inside father static method:");
    }
    public static void main(String[] args) {
        College childobj = new College();
       childobj.display();
       childobj.normal();
       //childobj.statMethod(); this calls its own static Method.
       statMethod(); //static method of parent can be accessed without using object reference.
       UniversityHead newobj = new College();
       newobj.statMethod();// this call parents static method.
    }
}
/* The public and protected methods of parent in different package can be accessed.
but the default and private methods cant be accessed by child if they are in different packages*/