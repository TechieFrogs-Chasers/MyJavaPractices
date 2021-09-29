package university;

public class UniversityHead {
    String name = "Bharath-university";
    int id= 340;
    protected void display(){
        System.out.println(" In university");
    }
     public UniversityHead(){
        System.out.println("inside University constructor");

    }
    public static void main(String[] args) {
        UniversityHead parentobj = new UniversityHead();
        parentobj.display();
    }
}
