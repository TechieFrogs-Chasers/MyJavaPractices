package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentComparator {
    private String studentname;
    private int rollno;
    private int studentage;

    public StudentComparator(String studentname, int rollno, int studentage) {
        super();
        this.studentname = studentname;
        this.rollno = rollno;
        this.studentage = studentage;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getStudentage() {
        return studentage;
    }

    public void setStudentage(int studentage) {
        this.studentage = studentage;
    }


    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }

}
//RollNo Class
class RollNoSortComparator implements Comparator<StudentComparator> {

    public int compare(StudentComparator o1, StudentComparator o2) {
        if(o1.getRollno() > o2.getRollno())
        {
            return 1;
        }
        else if(o1.getRollno() < o2.getRollno())
        {
            return -1;
        }
        else
        {
            return 0;
        }

    }

}
//NAME class
 class NameSortComparator  implements Comparator<StudentComparator>{


    public int compare(StudentComparator o1, StudentComparator o2) {
        return o1.getStudentname().compareTo(o2.getStudentname());
    }


    //Driver class
    public static void main(String[] args) {
        ArrayList<StudentComparator> list=new ArrayList<StudentComparator>();
        list.add(new StudentComparator("Siri",10,24));
        list.add(new StudentComparator("ram",5,23));
        list.add(new StudentComparator("hari",8,25));
        list.add(new StudentComparator("Varun",13,26));
        System.out.println("Sorting done based on StudentRollNumber");
        Collections.sort(list,new RollNoSortComparator());
        System.out.println(list);

        Collections.sort(list,new NameSortComparator());
        System.out.println("Sorting done based on StudentNAME");
        System.out.println(list);

    }
}