//package MethodAssignment;

class Degree3 {

    void getDegree() {
        System.out.println("I got a degree.");
    }
}

class Undergraduate extends Degree3 {

    public void getDegree() {
        super.getDegree();
        System.out.println("I am a undergraduate.");
    }
}

class Postgraduate extends Degree3 {

    public void getDegree() {
        super.getDegree();
        System.out.println("I am a postgraduate.");
    }
}

public class Degree6 {
    public static void main(String[] args) {
        Degree3 obj = new Degree3();
        Undergraduate obj1 = new Undergraduate();
        Postgraduate obj3 = new Postgraduate();

        obj.getDegree();
        obj1.getDegree();
        obj3.getDegree();

    }
}