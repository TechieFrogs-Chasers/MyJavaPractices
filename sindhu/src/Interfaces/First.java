package sindhu.src.Interfaces;

public interface First{

    void method();
    int i=7;

    interface Second
    {

        int j=88;
    }

public class Third
{
        void method()
        {
            
            System.out.println("abstract methods will implement in class");
        }
}


 interface Fourth extends Second,First 
 {

        public default void method()
        {
            System.out.println("implementing abstract method");
        }

        void core();

}

class fifth implements Second,First{

        void core(){
            
        }

        
    public void method() {

            
        }

    fifth(){
            System.out.println(" I can use constructors here bcz its a class");
        }

        
    }
public static void main(String[] args) {
            fifth x = new fifth();
            x.method();
            System.out.println(First.i);
            






    
        


        /*
        interface Fourth extends Second,First {

        public default void method(){
            System.out.println("implementing abstract method");
        }

        void core();

          
        public static void main(String[] args) {
    Fourth x = new Fourth();
        x.method();
        System.out.println(x.j);*/

        

        

       
        

    }
}

    

