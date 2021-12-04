package Collections.ListAssignment;

import java.util.ArrayList;
import java.util.Collections;

//34.WAP to sort Array List using Comparable and Comparator?
class Student implements Comparable<Student> {
    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
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

    public int compareTo(Student stu) {

        if(this.rollno > stu.getRollno())
        {
            return 1;
        }
        else if(this.rollno <stu.getRollno())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }


    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }

    //DRIVER CLASS
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<Student>();
        list.add(new Student(10,"Siri",24));
        list.add(new Student(5,"ram",23));
        list.add(new Student(8,"hari",25));
        list.add(new Student(13,"Varun",26));
        Collections.sort(list);
        System.out.println(list);

    }

    }


