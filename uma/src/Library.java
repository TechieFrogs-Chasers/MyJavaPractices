public class Library {

int total =100;
 int empid;
String name;
static int books=1000;

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

    





    }    
}
