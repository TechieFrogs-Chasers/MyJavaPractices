package RevisedConcepts;

import java.util.Scanner;



public class ScannerExample {
    public static void main(String[] args) {
    short faculty,  workers; 
    float salaryForfaculty, feePerStudent, salaryForWorker;

        System.out.println("----------Enter the School Details-----------");
        
            Scanner scObj = new Scanner(System.in);
                String schoolname = "Niveditha Adarsa MRR";
                schoolname = scObj.findInLine("Niveditha");
                //schoolname = scObj.findInLine("Adarsa");
                //sch   schoolname = scObj.findInLine("MRR");
                    String str = "Welcome to Niveditha School";
                    System.out.println("    " + str +"     ");
                    System.out.println("Enter Number of Faculty");
                        //facality = scObj.nextShort(); no need of this when we use method calling 
                        faculty = validatePositiveShorttNumber(scObj);
                        System.out.println("Number of Faculty in School:"+faculty);
        
                            System.out.println("Enter Number of Worker");
                            // workers = scObj.nextShort();
                            workers = validatePositiveShorttNumber(scObj);
                            System.out.println("Number of workers in school :"+workers);

                            System.out.println("Enter Number of students");
                            // int students = scObj.nextInt();
                            int students = validatePositiveIntNumber(scObj);// calling the validate method 
                            System.out.println("Number of Students in school :"+students);

                            System.out.println("Enter salary for Individual Faculty");
                            //salaryForfaculty = scObj.nextFloat();
                            salaryForfaculty = validatePositiveFloatNumber(scObj);
                            System.out.println("salary for Individual Faculty :"+salaryForfaculty);

                                System.out.println("Enter salary for Individual Worker");
                                //salaryForWorker = scObj.nextFloat();
                                salaryForWorker = validatePositiveFloatNumber(scObj);
                                System.out.println("salary for Individual Worker :"+salaryForWorker);

                                    System.out.println("Enter fee for Individual ClassesObjects.Student");
                                    //feePerStudent = scObj.nextFloat();
                                    feePerStudent = validatePositiveFloatNumber(scObj);
                                    System.out.println("Fee for Individual ClassesObjects.Student :"+feePerStudent);
                                    scObj.close();
    }
   
    static int validatePositiveIntNumber(Scanner scanner){
        int num;
        do{
            System.out.println("Please enter a valid number");
            while(!scanner.hasNextInt()){
            String input = scanner.next();
            System.out.println("Please enter a valid number");
        }
        num = scanner.nextInt();
        }while(num<=0);

    System.out.println("Enter value is valid ");
   return num;
}
public static float validatePositiveFloatNumber(Scanner scanner){
    float fnumber;
    do{
        System.out.println("Please enter a valid float number");
        //Scanner scObj;
        while(!scanner.hasNextFloat()){
        String str = scanner.next();
        System.out.println("Please enter a valid float number");
    }
    fnumber = scanner.nextFloat();
    }while(fnumber<=0);

System.out.println("Enter value is a valid flaot number ");
return fnumber;// default expresion takes int so we need to do type cast
}
public static short validatePositiveShorttNumber(Scanner scanner){
    short snumber;
    do{
        System.out.println("Please enter a valid short number");
        //Scanner scObj;
        while(!scanner.hasNextShort()){
        String str = scanner.next();
        System.out.println("Please enter a valid short number");
    }
    snumber = scanner.nextShort();
    }while(snumber<=0);

System.out.println("Enter value is a valid short number ");
return snumber;
}
}