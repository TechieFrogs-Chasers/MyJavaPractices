package Collections.Map;



import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//23.Explain Can add duplicate user-defined objects to Tree Map with an example? If yes then what is solution?
public class Assignment_23_UserDefined {
    public static void main(String[] args) {
        Set<Student> tm=new TreeSet<Student>();
        tm.add(new Student(1,"Leo"));
        tm.add(new Student(1,"Ram"));
        tm.add(new Student(2,"Kiran"));
        tm.add(new Student(3,"Jim"));
        tm.add(new Student(1,"Srinu"));
        System.out.println(tm);

    }
}
