package OopsPractices.InheritanceAssignment;
class Apple{
int number_of_apples;
     Apple(){
     System.out.println("it is super constructor");
     }
}
class Bannana extends Apple{
    int number_of_bannana;
    Bannana(){
        System.out.println("it is child constructor");
    }
    void memberShow(int number_of_apples ,int number_of_bannana  ){
        super.number_of_apples = number_of_apples;
        this.number_of_bannana = number_of_bannana;
        System.out.println("Number of bannans is "+number_of_bannana);
        System.out.println("number of Apples is "+ number_of_apples);
    }
}
public class AppleBannana {
    public static void main(String[] args) {
        Bannana obj = new Bannana();
        obj.memberShow(6,7);
    }
}
