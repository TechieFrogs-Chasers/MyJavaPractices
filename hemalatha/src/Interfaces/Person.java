package Interfaces;
/* multiple inheritence using interface */

interface Person {
    int i=20000;
    void salary();   
}
interface Student{
    void marks();
}
class People implements Person,Student{
    public void salary(){
        System.out.println("enter salary:");
    }
    public void marks(){
        System.out.println("enter marks:");
    }
public static void main(String[] args) {
    People ppl = new People();
    ppl.salary();
    ppl.marks();
    System.out.println(Person.i);
}
    
}



