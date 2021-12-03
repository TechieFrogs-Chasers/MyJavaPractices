package Collections.Map;
public class Student implements Comparable<Student>{
    int rollno;
    String name;
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return rollno+" "+name;
    }
    public int compareTo(Student o)
    {
        if (rollno == o.getRollno()) {
            return 0;
        }
        else if (name.compareTo(o.getName()) < 0) {
            return -1;
        }
        else
            return 1;
    }
}
