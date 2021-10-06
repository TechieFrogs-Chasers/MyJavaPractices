public class Degree {
    void getDegree(){
        System.out.println("I got a degree");
    }
    public static void main(String[] args) {
        System.out.println("We are in main method:");
        Degree obj = new Degree();
        obj.getDegree();
        Undergraduate obj1 = new Undergraduate();
        obj1.getDegree();
        Postgraduate obj2 = new Postgraduate();
        obj2.getDegree();
    }
    
}
class Undergraduate extends Degree{
    void getDegree(){
        System.out.println("Iam an undergraduate");
    }
}
class Postgraduate extends Degree{
    void getDegree(){
        System.out.println("Iam an postgraduate");
    }
}
