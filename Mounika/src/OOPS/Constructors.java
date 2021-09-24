package OOPS;


 class School{ 
/*class can't be public when using multiple classes only the main classe should be public 
the file name and the class name should match*/
    String schoolName = "Niveditha";
    int schoolBlocks = 10;
    static short students = 1500; 
    // ststic should not used in local variable
    float passPercentage = 95.5f;
  //  public static void main(String... args){
    // not able to create a methods inside a method
// if we have multiple classes in single file with multiple main methods compiler asks which class sshould run
//public - used to access from anywhere, f we given public we can use this class from any file
//static - to allocated some menory in stack area, so no need of obj, memory allocated once
//main - used from main method our actual program run jvm consider our program from main() (method)
//String[] args - used to pass command line arugments
   
    
    void school(){
       // School schoolObj = new School(); instance should not be here next menthod not able to access the obj
        System.out.println(schoolName);
    }
    void blocks(){// method
        System.out.println(schoolBlocks);
    }
    void passParcentage(){//method
        System.out.println("Pass");

    }
}



public class Constructors {
    static int numberofclasses = 3;
    String name;
    byte age;
    char gender;
    Constructors(){ // default constructor
        /*Constructors() to see it jus tlike method but is is a constructors, 
    there is no need to call explicitly, complier will take care, name shoul match with 
    the class name, no need to have return type, each time obj is created constructed is called
    can allow access modifiers -  EX: private void school()*/
    //can't be abstract, static, final
        
    //final void school(){
        byte age = 28;
        char gender = 'F';
    }
    public static void main(String[] args) {
        School schoolObj = new School();
        schoolObj.schoolName = "Niveditha";
        schoolObj.blocks();
        schoolObj.passParcentage();
        schoolObj.school();
        //schoolObj.students=1600;
        School.students=1600; // better to acceess with that class name as it is static variable
        Students studentsObj = new Students(100);
        Students.studentsInClass1 = 10;
        Students studentsObj1 = new Students(600, " Sri");
        Students.studentsInClass1= 80;
        //studentsObj1.display();
        
        studentsObj1.boys=20;
        Constructors constructorsObj = new Constructors();
        Constructors.numberofclasses=4;
        constructorsObj.age = 29;
        constructorsObj.name="MADHU";
        System.out.println("NAME :"+constructorsObj.name+" AGE :"+constructorsObj.age);
        /*Line above need to keep in mind instance variable can print with the obj only for 
        static and local in the time prime obj is not req*/

        System.out.println(Students.studentsInClass1+" "+Students.studentsInClass1);//80 static variablle
        studentsObj.count();


        /*Constructors() to see it jus tlike method but is is a constructors, 
        there is no need to call explicitly, complier will take care, name shoul match with 
        the class name, no need to have return type, each time obj is created constructed is called
        can allow access modifiers*/
        
        
    }
    
}
class Students{
    static int studentsInClass1 = 50;
    int girls = 500;
    int studentsInClass2 = 40;
    String studentName = "SRI";
    int boys = 1000;
    Students(int i){
        //Constructor used to intialize the data for variables, this is 
        girls = i;
        System.out.println("1st Constructor");
    }
    
    Students(int i, String name){
    //Constructor used to intialize the data for variables, this is 
        girls = i;
        name = studentName;
        //int studentsInClass2 = 50;
            System.out.println(girls+" "+name);
            System.out.println("2nd Constructor");
    }

    /*public static void main(String[] args) {
        System.out.println("Hi");
    } */
    void count(){
        System.out.println("Boys");
                      
    }

}


class Faculty{

    public static void main(String[] args) {
        int totalFaculty= 50;
        byte englisFac = 5;
        byte mathFac = 5;
        Faculty facultyObj = new Faculty();
        //facultyObj.englisFac= 60;
        
        
    }

}