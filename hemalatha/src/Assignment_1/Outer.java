package Assignment_1;

public class Outer {  //driver class 
    void outermethod(){ //first method in outer class
        int price=2;
        String brand="honda";
        System.out.println("enter the car details");
        System.out.println("enter brand name:"+brand);
        System.out.println("enter price of the car:"+price);
    }
     public String innermethod(){ //second method in outer class 
         String location="usa";
         System.out.println("enter location of company:"+location);
         return location;
    }
        class Inner{    //inner class
            void employee(){    //inner class method 
                int salary=22222;
                String name="hello";
                System.out.println("enter employee details:");
                System.out.println("enter employee salary:"+salary+" ,"+name);
        }
        protected Inner(){      //inner class constructor using access modifier protected
            System.out.println("this is constructor of inner class");
        }
           /* private Inner1(){           //one more constructor in inner class
                int i = 10;
            System.out.println("the value of i is :"+i);
        }*/
        class Student{          //nested class
            private class Course{            //this is also nested class using private
                static int count;           //using static variable
                String address;
             void college(){             //this is method in course class
                 System.out.println("enter no.of students:"+count);
                System.out.println("enter address:"+address);
                } 
            }
        
                              
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.outermethod();
        Inner obj2 = obj.new Inner();
        obj2.employee();                        //this is all we using the instances in our classes
        Student obj3 = obj2.new Student();
        Course obj4 = obj3.new Course();
        obj4.count=20000;
        obj4.address="india";
        obj4.college();


        
    }  

    }

    }
}
    

