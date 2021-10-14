package university;

public class UniversityHead {
    String name = "Bharath-university";
    int id= 340;
    protected void display(){
        System.out.println(" In grandparent protected method:");
    }
    public void normal(){
        System.out.println(" Inside grand parent public method:");
    }
    protected static void statMethod() {
        System.out.println("Inside Static Method of grandparent");
    }
     public UniversityHead(){
        System.out.println("inside University constructor");

    }
    public static void main(String[] args) {
        UniversityHead parentobj = new UniversityHead();
        parentobj.display();
    }
}
