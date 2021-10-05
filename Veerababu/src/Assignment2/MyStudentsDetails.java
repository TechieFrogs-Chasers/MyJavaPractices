package Assignment2;

/*public class MyStudentsDetails {
   /* String Student1;
    int RollNumber;
    String Mobile;
    String Branch;
    String Address;

    String Student2;
    int RegisterNumber;
    String Contact;
    String Stream;                                                              
    String Identity;
    int Members;

    public static void main(String[] args)
    {
        MyStudentsDetails myStudentsDetailsObj = new MyStudentsDetails();

        
        MyStudentsDetails myStudent1 = new MyStudentsDetails("veeru", 114, "8341727692", "Civil", "Kakinada");
        System.out.println("First Student"+" "+myStudent1.Student1);
        System.out.println("Roll Number"+" "+myStudent1.RollNumber);
        System.out.println("Mobile"+" "+myStudent1.Mobile);
        System.out.println("Branch"+" "+myStudent1.Branch);
        System.out.println("Location"+" "+myStudent1.Address);

        MyStudentsDetails myStudent2 = new MyStudentsDetails("Pavan", 103, "9951332782", "Civil", "Vijayawada", 2);
        System.out.println("Second Student"+" "+myStudent2.Student2);
        System.out.println("Roll Number"+" "+myStudent2.RegisterNumber);
        System.out.println("Mobile"+" "+myStudent2.Contact);
        System.out.println("Branch"+" "+myStudent2.Stream);
        System.out.println("Location"+" "+myStudent2.Identity);
        System.out.println("No Of Persons"+" "+myStudent2.Members);
    }

    MyStudentsDetails()
    {
        System.out.println("Default Parameter");
    }

    MyStudentsDetails(String Person,int number, String mob, String study, String Id )
    {
       Student1 = Person;
       RollNumber = number;
       Mobile = mob;
       Branch = study;
       Address = Id; 
       System.out.println("First Student");
    }
    MyStudentsDetails(String Person,int number, String mob, String study, String Id, int Persons )
    {
       Student2 = Person;
       RegisterNumber = number;
       Contact = mob;
       Stream = study;
       Identity = Id;
       Members = Persons;
       System.out.println("Second Student");
    }

}*/

class Students
{
    String name;
    int rollNumber;
    public static void main(String[] args) {
        
    Students studentsObj = new Students("Hello", 50);
    System.out.println("Name"+" "+studentsObj.name+" "+"Number"+" "+studentsObj.rollNumber);

    }
    Students(String n, int r)
    {
      name = n;
      rollNumber = r;  
    }
}