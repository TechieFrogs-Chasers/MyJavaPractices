public class Inherit {
  private float salary=40000; //instansce variable 

    public float getSalary() {
        return this.salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    
}
class Inherit2 extends Inherit {  //here we use the inheritence calling parent class from child class
                                 // we use extends for that keyword
    int bonous=10000;

       class Inherit3 extends Inherit{//created a inner class 
           int num=20;
           void student(){
           this.setSalary(60);
           System.out.println("student rollno:"+num+" "+"employee salary" );
           }

       }
    public static void main (String...args){
       Inheritdemo obj=new Inheritdemo();
       // Inherit obj2=new Inherit();
       Inherit obj2=new Inherit();
       obj2.setSalary(60000);
       Inherit3 Inherit3obj=obj.new Inherit3();
       Inherit3obj.student();
        System.out.println("Total salary:"+(obj2.getSalary()+obj.bonous));
    }
}
