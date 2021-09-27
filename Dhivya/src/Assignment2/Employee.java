

public class Employee {
    public static void main(String[] args) {
        System.out.println("     Name        Year of joining      Address ");
        Employee obj = new Employee("Robert",1994,2443967891L,"64C-WallsStreet");
        Employee obj1 = new Employee("Sam",2000,4045678901L,"26C-WallsStreet");
        Employee obj2 = new Employee("JOHN",2010,234678901L,"26C-WallsStreet");
        
    }
    Employee(String name,int yoj,long phno, String address)
    {
    
        System.out.println("  "+ name+"      " +yoj + "      " + phno + "      " + address);
    }
    
}
