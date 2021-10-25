package Inheritence;
    
     class Master{
        int age;
        String name;
         private void subject()
         {
            System.out.println("this is parent class");
            System.out.println("enter name:"+name);
         }
        
     final class People extends Master{
        int salary;
        String address;
        void count()
        {
            System.out.println("this is child class");
            System.out.println("enter the age:"+age);
        }
    }
    

    public class Assign{

    }
    
    public static void main(String[] args) {
        Master master = new Master();
        master.subject();
        People ppl = master.new People();
        ppl.count();
        //ppl.subject();
    }
}
    


    

    



    
    
    

    


        
    
        
        
            
        
    
        
    

    
 
 
 


 
    




    
    

 




