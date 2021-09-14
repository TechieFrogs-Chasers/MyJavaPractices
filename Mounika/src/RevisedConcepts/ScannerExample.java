import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        short facality,  workers; 
       
        float salaryForfacality, feePerStudent, salaryForWorker;

        System.out.println("----------Enter the School Details-----------");
        //System.out.println("Enter School Name");
        Scanner scObj = new Scanner(System.in);
        String schoolname = "Niveditha Adarsa MRR";
        schoolname = scObj.findInLine("Niveditha");
        //schoolname = scObj.findInLine("Adarsa");
        //sch   schoolname = scObj.findInLine("MRR");
        String str = "Welcome to Niveditha School";
        System.out.println("    " + str +"     ");
        System.out.println("Enter Number of Facality");
        facality = scObj.nextShort();
        facality = validatepositiveshorttnumber(scObj);
        System.out.println("Number of Facality in School:"+facality);
        
        System.out.println("Enter Number of Worker");
        workers = scObj.nextShort();
        workers = validatepositiveshorttnumber(scObj);
        System.out.println("Number of workers in school :"+workers);

        System.out.println("Enter Number of students");
        int students = scObj.nextInt();
        students = validatepositivenumber(scObj);// calling the validate method 
        System.out.println("Number of Students in school :"+students);

        System.out.println("Enter salary for Individual facality");
        salaryForfacality = scObj.nextFloat();
        salaryForfacality = validatepositivefloatnumber(scObj);
        System.out.println("salary for Individual facality :"+salaryForfacality);

        System.out.println("Enter salary for Individual Worker");
        salaryForWorker = scObj.nextFloat();
        salaryForWorker = validatepositivefloatnumber(scObj);
        System.out.println("salary for Individual Worker :"+salaryForWorker);

        System.out.println("Enter fee for Individual Student");
        feePerStudent = scObj.nextFloat();
        feePerStudent = validatepositivefloatnumber(scObj);
        System.out.println("Fee for Individual Student :"+feePerStudent);
        scObj.close();
    }
   
    static int validatepositivenumber(Scanner scanner){
        int num;
        do{
            System.out.println("Please enter a valid number");
            while(!scanner.hasNextInt()){
            String input = scanner.next();
            System.out.println("Please enter a valid number");
        }
        num = scanner.nextInt();
        }while(num<=0);

    System.out.println("Enter value is a valid ");
   return num;
}
public static float validatepositivefloatnumber(Scanner scanner){
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
public static short validatepositiveshorttnumber(Scanner scanner){
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
return snumber;//
}
}