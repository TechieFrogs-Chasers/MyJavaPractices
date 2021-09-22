package Practices;

import java.util.Scanner;

public class ConstructorsForCompany {//Driver class

    static class company {//Class

        company() {//Default Constructor
            System.out.println("Company Name: Lenovo");
        }

        void companyId() {//Method
            System.out.println("Enter your company id number:");
        }
    }

    public static void main(String[] args) {//main method
        company myCompanyObj = new company();//obj for company Constructor
        Scanner myScannerObj = new Scanner(System.in);//Scanner
        myCompanyObj.companyId();//call for companyId method
        int companyId = myScannerObj.nextInt();//input scanner for companyId
        details myDetailObj = new details();
        myDetailObj.employeeDetails();//obj for emplyoeeDetails method
        int employeeDetails = myScannerObj.nextInt();//Input Scanner for employeeDetails
        myScannerObj.close();//Scanner closed
    }

}
