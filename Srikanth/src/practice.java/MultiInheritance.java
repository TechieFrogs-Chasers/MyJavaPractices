class Teacher {
    void teach() {
        System.out.println("Who does teach stuff.");
    }
}

class HomeTution extends Teacher {
    void extraClass() {
        System.out.println("learning stuff again.");
    }
}

class Student extends HomeTution {
    void read() {
        System.out.println("who does reading.");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.teach();
        s.extraClass();
        s.read();
    }
}
