package Practices;

import java.util.Scanner;

class details {//class- details

    void employeeDetails() {//employeeDetails method -in class details
        System.out.println(" Enter employee ID:");
    }

    void employeeName() {//employeeName method- in class details
        System.out.println("Enter employee name:");
    }

    details() {//Default Constructor for details class
        System.out.println("Its my Default Constructor for details.");
    }


    public static class ConstructorsMethods {//Driver Class

        ConstructorsMethods() {//Default Constructor
            System.out.println("Its my Driver class Default Constructor.");
        }

        static class departments {// class-departments

            void employeeDepartments() {//employeeDepartments method-in class department
                System.out.println(" Enter no.of employee departments: ");
            }

            departments() {//Default Constructor for departments class
                System.out.println("Its my Employee department constructor! ");
            }

            public static void main(String[] args) {//main
                departments empDepObj = new departments();//obj for default departments
                empDepObj.employeeDepartments();//obj for employeeDepartments method
                Scanner myScannerObj1 = new Scanner(System.in);//scanner2
                int employeeDepartment = myScannerObj1.nextInt();//Scanner for employeeDepartment
                myScannerObj1.close();//Scanner2 closed

            }
        }

        public static void main(String[] args) {//main
            details myDetailObj = new details();//obj for default details
            ConstructorsMethods conObj = new ConstructorsMethods();//obj for default constructorMethod
            Scanner myScannerObj = new Scanner(System.in);//scanner
            myDetailObj.employeeDetails();//obj for emplyoeeDetails method
            int employeeDetails = myScannerObj.nextInt();//Input Scanner for employeeDetails
            myDetailObj.employeeName();//obj for emplyoeeName method
            String employeeName = myScannerObj.next();//Input Scanner for employeeName
            myScannerObj.close();//Scanner closed
        }
    }
}
