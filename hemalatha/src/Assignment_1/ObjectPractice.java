package Assignment_1;
    class Student{
        int id=12,i;
        String name="ABC";
        String address="India";
     /*ObjectPractice prac = new ObjectPractice();
     {
         int i=200;
         string name="B";
         ObjectPractice();
         {
        System.out.println(prac.name);
         }*/
        void hema()               //you must have the file name and driver class name should be same.
           {
              System.out.println("primary");
            }
        }
    class Teacher{
        int salary=2000;
        String name = "k";
    

          /*if you want u can write main method to any class, 
                             in execution it will ask which main method i have to execute then u can select that one and run*/
        void monday()
        {
            System.out.println("teacher salary");
        }
    }

public class ObjectPractice {  //driver class
        int id=12,i;
        static int j;                   //in one file we use to create multiple classes
         String name = "hema";
        static String address = "USA";
        void display()
        {
            System.out.println("object class");
        }  
       
        public static void main(String[] args) {
   /*if you remove the main method in driver class also it would be allowed 
      because u can write main method for any other class.*/                                             
            ObjectPractice myObj=new ObjectPractice();
             //static variables we can access without object
            myObj.display();
            myObj.i=5;
            ObjectPractice.j=10;
            System.out.println(myObj.name+" "+myObj.id+" " +address+" "+myObj.i+" "+ObjectPractice.j); 
            ObjectPractice myObj3=new ObjectPractice();
            myObj3.i=10;
            ObjectPractice.j=20;   //static memory will be allocated only once.
            System.out.println("University"); 
            Student myObj1=new Student();
            System.out.println(myObj1.name+" "+myObj1.address+" "+myObj1.id);
            myObj1.hema();
            System.out.println("Hello world");
            Teacher myObj2=new Teacher();
            System.out.println(myObj2.salary+" "+myObj2.name+" "+myObj.i+" " +myObj3.i+" "+ObjectPractice.j);
            myObj2.monday();
            System.out.println("college");

            
        }
    }











        

         

    



    
    

