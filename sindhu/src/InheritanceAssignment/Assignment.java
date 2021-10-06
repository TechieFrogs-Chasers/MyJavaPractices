package sindhu.src.InheritanceAssignment;

public class Assignment {

    int i;
    String name;

    void hi(){
        System.out.println("this is parent class");
    }


    public static void main(String[] args) {
        Assignment x = new Assignment();
        x.hi();
    }

}


 class Test extends Assignment{
    void hey(){
        System.out.println("this is sub-class");
    }
    
    public static void main(String[] args) {
            Test y = new Test();
            y.hey();
            y.hi();

        }
}


