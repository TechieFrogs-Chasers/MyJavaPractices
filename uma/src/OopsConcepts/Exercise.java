package OopsConcepts;

public class Exercise {
    
}
class Student {
    String name="John";
    int rollno = 2;
    String address;
    long phone;

    void record(int r,long p,String n,String a){
      name=n;
      phone=p;
      address=a;
      rollno=r;
    }
    void display(){
     System.out.println("student name is "+name+ ",  and roll no is  "+rollno);
     System.out.println("phone no is  "+phone+ ",  address is  "+address);
    }

   
    public static void main(String[] args) {
    
    Student Obj =new Student();

    System.out.println("name is  "+Obj.name+"  "+" and roll no is  "+Obj.rollno);

    Student Obj1 =new Student();
    Obj1.record(10,31454658,"sam","st.louis");

    Obj1.display();
    Student Obj2 =new Student();
    Obj2.record(20, 314968905, "John", "st.louis");

    Obj2.display();

    } 
}


class Triangle{
  int one=3;
  int two=4;
  int three=5;


  void area(){
    int area = (one*two)/2;
    System.out.println(area);
  }

  void perimeter(){
    int p = (one+two+three);
    System.out.println(p);
  }
  public static void main(String[] args) {
    
 Triangle obj = new Triangle();

 obj.area();

 obj.perimeter();

  }

}
class Triangle1{

  int side1;
  int side2 ;
  int side3 ;

  void display(){
   side1=3;
   side2=4;
   side3=5;
    System.out.println("perimeter of the triangle is "+(side1+side2+side3));
    System.out.println("area of the triangle is  "+ (side1*side2)/2);
  }

  Triangle1(int a,int b, int c){
   System.out.println();
  }

public static void main(String[] args) {
  

 Triangle1 Obj= new Triangle1(3,4,5);
Obj.display();
  
}



}