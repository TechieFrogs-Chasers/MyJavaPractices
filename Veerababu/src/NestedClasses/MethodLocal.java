package NestedClasses;

public class MethodLocal {
    String name;
    int RollNumber;
    String Mobile;
    String Address;
    
    MethodLocal()
    {
        System.out.println("Enter the Student Details");
    }
    MethodLocal(String Person, int No, String Phone, String Details)
    {
        name = Person;
        RollNumber = No;
        Mobile = Phone;
        Address = Details;
        System.out.println("In the First Constructor");
    }
    void display()
    {
        System.out.println("In the First Class Method");

        class MethodInner
        {
            int x=5;
            MethodInner()
            {
                System.out.println("In the Method Inner Class Constructor");
            }

           protected MethodInner(String Person, int No, String Phone, String Details)
            {
                  name = Person;
                  RollNumber = No;
                  Mobile = Phone;
                  Address = Details;
                  System.out.println("In the Second Class Constructor  "+name+" "+Mobile);
            }
           private void window() 
            {
                System.out.println("Hello Window");
            }
        }
        MethodInner methodInner = new MethodInner();
        MethodInner methodInner1 = new MethodInner("GSM", 125, "9951332782", "Hyderabad");
        methodInner1.window();
        System.out.println("name  "+name);
        
        
       
        
        
    }
    public static void main(String[] args) {
        MethodLocal methodLocal = new MethodLocal();
        methodLocal.display();
        MethodLocal methodLocal1 = new MethodLocal("Mahesh", 114, "8341727692", "Vijayawada");
        System.out.println("Name :  " +methodLocal1.name+" "+"Mobile : "+methodLocal1.Mobile+" "+"Address : "+" "+methodLocal1.Address);
        
    }

}
