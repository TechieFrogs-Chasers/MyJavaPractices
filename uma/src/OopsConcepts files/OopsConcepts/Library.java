package OopsConcepts;

public class Library {

int total =100;
 int empid;
String name;
static int totalbooks=1000;

void display(){
    System.out.println("number of employees is  ");
}

void record(){
    int code=1;
    String empname="uma";
    String empposition="book keeper";
    System.out.println("name is  "+ empname+"  and position is   "+empposition+" and login code is  "+code);
    
}
    public static void main(String[] args) {
        
    Library myObj = new Library();

    myObj.display();

    System.out.println(myObj.total);

    myObj.record();

    myObj.empid =10;

    System.out.println("employee id is   "+myObj.empid);

    System.out.println("total books are  "+totalbooks);  //accessing static variable

   Dogs dogObj=new Dogs(); //creating new object for Dogs class

   dogObj.breed();   //calling a method from Dogs class


  Books bookObj =new Books();
   bookObj.count();

}  
}

 class Books{

    int st=15;
    int fic=20; 
    int num;
    String name;
    float f;

    public void old() {
        int old=50;
        System.out.println("number of old books is" +old);
   
     System.out.println();
    }

    void newbooks(){

     int nbooks=50;
     System.out.println("number of new books is  "+nbooks);
    }

     void count() {
        
      Books storyObj= new Books() ;
      Books fictionObj = new Books();
       storyObj.st=10;
        storyObj.old();
        fictionObj.newbooks();
        System.out.println(storyObj.st );
    }

public static void main(String[] args) {
   

    Books bookObj = new Books();
    bookObj.old();
    bookObj.newbooks();
    bookObj.count();
    //we dont have to print anything, just call the methods

    System.out.println(bookObj.num); //prints 0 because default value of integer is 0
    System.out.println(bookObj.f);  // default constructor compiles to give default value
}


    }    

