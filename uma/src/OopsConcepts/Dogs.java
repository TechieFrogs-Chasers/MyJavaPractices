package OopsConcepts;
import java.util.Scanner;

public class Dogs {
    
int small;
int medium=5;
int big;

void breed(){
   String p= "palmarian";
   String d= "dalmatian";
   String l= "labrador";
System.out.println(p+"/  "+d +"  / "+ l);
}

public static void main(String[] args) {
    
Scanner scannerObj = new Scanner(System.in); //trying to take input from end user using scanner

System.out.println("enter the type of dog");
System.out.println("small / medium / big");
scannerObj.next();
 
Dogs dogObj =new Dogs(); //creating object for dog  class
Dogs dogObj1=new Dogs();

dogObj.big=10;
dogObj1.color();
//dogObj1.medium; //"insert variable declarators"  error even after i gave the value

System.out.println("the breeds available are");
dogObj.breed();     //calling the method breed

System.out.println("the color options are");
dogObj.color();

//Petstore petObj = new Petstore(); //trying to create an obj for another class

scannerObj.close();
}

void color(){

    String b= "black";
    String w = "white";
    String  br ="brown";
  System.out.println( b +"  /  "+ w + "  /  " + br);

}
}
//another class

 class Petstore{
       
  int emp;
  int empcode;
  String empname;

  void empRecord(){
      emp =10;
      empcode = 20;
      empname="uma";
  }

  void display(){
      System.out.println(empname +"is our employee with code " + empcode);
  }    

// class in other class called sub class

  class PetMart{

 public static void main(String[] args) {
     
  Petstore petObj = new Petstore(); //"no enclosing instance of type Dogs is available"
                                    // did not close the Petstore class beforecreating an aother class
  petObj.empRecord();
  petObj.display();


 }
 }
 }





