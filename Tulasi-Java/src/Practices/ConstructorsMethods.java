package Practices;

import java.util.Scanner;

class details {//Class- details
     String areaName;
     int totalemployee;
     byte serviceCenters;
     float income;
     char logo;

    void employeeDetails() {//employeeDetails method -in class details
        System.out.println("Enter employee ID:");
    }

    void employeeName() {//employeeName method- in class details
        System.out.println("Enter employee name:");
    }
     //Constructor Overloading

    details() {//Default Constructor for details class
        System.out.println("Its a Default Constructor for company details.");
    }
    details(char logoletter){//Parameterized constructor -char
        logo= (char) logoletter;
        System.out.println("Logo of the company :"+" "+ (char) 76);

    }
    details(String branchName){//Parameterized constructor -String
        areaName=branchName;
        System.out.println("Branch name:"+ areaName);
    }
    details(int count,byte centers ){//Parameterized constructor -int,byte
        totalemployee=count;
        serviceCenters=centers;
        System.out.println("TotalEmployees:"+ totalemployee+", "+ "Service Centers:" + serviceCenters);
    }
    details(String company,float companyIncome){//Parameterized constructor -String,float
        income=companyIncome;
        System.out.println(company+" " +"Company income"+ " : "+ income);
    }
    details(String company, char logoletter, float companyIncome){//Parameterized constructor -String,char,float
        System.out.println(company +" " +"Company logo is: "+ logoletter+" "+ "Company income : "+ companyIncome);
    }

    void dispalyParameter(){//method used for Parameterized constructor

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
            details myDetailObj = new details();//obj for default details constructor
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
