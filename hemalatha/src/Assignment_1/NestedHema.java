package Assignment_1;

public class NestedHema {
    int age=22;
    String name="Hi",location="usa";
    void display(){
        System.out.println("college details:" +location);
    }
     private class NestedClass{
        static int k=0;
       static String address;
        void nextdisplay(){
            System.out.println("Faculty details:" +name+ " " +address);
    }

     protected NestedClass(){
           int j=0;
        System.out.println("student details:" +age+ " " +k);
        nextdisplay();
        display();
     }
        //public static void main(String[] args) {
        //NestedClass obj2 = new NestedClass();
         
     }
    
    public static void main(String[] args) {
        NestedHema obj1 = new NestedHema();
        NestedClass obj2 = obj1.new NestedClass();
       // obj2.nextdisplay();
        //obj1.display();
}
    }



    

