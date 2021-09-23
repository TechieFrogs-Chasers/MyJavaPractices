package OOPS;

class SubClass{
    int rollnumber = 14;
    void write(){
        int classStrength = 10;
        System.out.println("Number of Students");
        System.out.println(classStrength);
        
    }

}
public class SuperClasses {
    int studentId= 10;
    String schoolName;
    static String studentName = "Mounika";
    static int marks = 400;
        void display(){
            int studentId = 15;
            System.out.println(studentId);
            //  SuperClasses superclassesObj = new SuperClasses();
            // superclassesObj.studentId=20;
            SuperClasses.marks= 500; // as marks is static we can ccall it with classname.variable name

        }
        public static void main(String[] args) {
            int totalschools = 5;
            String schoolName = "Niveditha";
            SuperClasses superclassesObj = new SuperClasses();// seperate menory alloction done in heap area
           // superclassesObj.studentId= 30;
            superclassesObj.display();// calling display method
            SuperClasses superclassesObj1 = new SuperClasses();// seperate menory alloction done in heap area
            superclassesObj1.studentId= 50;
            superclassesObj1.schoolName= "MRR";
            superclassesObj1.display();
                
                System.out.println(SuperClasses.studentName);
                System.out.println(SuperClasses.marks);
                SubClass subclassObj = new SubClass();
                subclassObj.write();
                System.out.println(superclassesObj.studentId+" "+superclassesObj1.studentId+" "+superclassesObj1.schoolName);
                System.out.println(totalschools+" "+ subclassObj.rollnumber);
    
    }
}