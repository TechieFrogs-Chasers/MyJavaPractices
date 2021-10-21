//package InheritanceAssignment;

public class ClassA {
    int i;
    int j;

    void show() {
        System.out.println("Values of i and j are: " + i + " " + j);
    }
}

class b extends ClassA {
    int k;

    b() {

    }

    void show() {
        System.out.println("Value of k is: " + k);
    }
}

class a {
    public static void main(String[] args) {
        b objbB = new b();
        objbB.show();
    }
}