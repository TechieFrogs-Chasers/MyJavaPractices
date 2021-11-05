package ClassesObjects;
import java.util.Scanner;

public class Emp {//class
        String name;
        int year;
        String address;

        void data(Scanner myScannerObj){//data method
            System.out.println("Enter Employees Name :");
            name = myScannerObj.next();
            System.out.println("Enter Joining Year :");
            year = myScannerObj.nextInt();
            System.out.println("Enter Employees Address :");
            address = myScannerObj.next();
        }
        void displayEmp(){//employee method

            System.out.println(name+"          "+year+"     "+address);
        }

        public static void main(String[] args){//main
            Scanner myScannerObj = new Scanner(System.in);//Scanner
            Emp emp1 = new Emp();
            emp1.data(myScannerObj);
            Emp emp2 = new Emp();
            emp2.data(myScannerObj);
            Emp emp3 = new Emp();
            emp3.data(myScannerObj);
            System.out.println("Name         JoiningYear      Address");
            emp1.displayEmp();
            emp2.displayEmp();
            emp3.displayEmp();
            myScannerObj.close();//Scanner closed
        }
    }


