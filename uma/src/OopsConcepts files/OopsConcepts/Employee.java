package OopsConcepts;

public class Employee {
    String empName,year,address;
    String salary;

Employee(String n,String y,String a,String s){
    empName= n;
    year=y;
    address=a;
     salary=s;
}

void display(){
    System.out.println(empName +"   "+year +"   "+address+"   "+salary);
}

public static void main(String[] args) {
    
Employee obj3 = new Employee("name", "  year", "     address   ","salary");
Employee obj = new Employee("robert", "1994", "64-c wallstreet","10000" );
Employee obj1= new Employee("sam   ", "2000", "68-D wallstreet","15000");
Employee obj2= new Employee("John  ", "1999", "26-B wallstreet", "20000");
obj3.display();
obj.display();
obj1.display();
obj2.display();

}


}
