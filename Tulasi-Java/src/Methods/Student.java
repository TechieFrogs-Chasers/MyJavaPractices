package Methods;//Package

public class Student {//Driver Class
    String name;//Variables
    byte age;
    String address;

    Student() {//Constructor
        name = "unKnown";
        age = 0;
        address = "not available";

    }

    public void setInfo(String nameOfStudent, byte ageOfStudent)//Method with Parameters
    {
        name = nameOfStudent;
        age = ageOfStudent;
        System.out.println("Name of the Student : " + nameOfStudent + " , " + "Age of the Student :" + ageOfStudent);
    }

    public void setInfo(String nameOfStudent, byte ageOfStudent, String addressOfStudent)//Methods with Parameters
    {
        name = nameOfStudent;
        age = ageOfStudent;
        address = addressOfStudent;
        System.out.println("Name of the Student : " + nameOfStudent + " , " + "Age of the Student :" + ageOfStudent + " , " + "Address of the student :" + addressOfStudent);
    }

    public static void main(String[] args) {//main method
        Student myStudentObj[] = new Student[10];//Creating Instance with Single dimensional Array

        myStudentObj[0] = new Student();
        myStudentObj[0].setInfo("John", (byte) 18, "Atlanta");

        myStudentObj[1] = new Student();
        myStudentObj[1].setInfo("Leo", (byte) 19, "NY");

        myStudentObj[2] = new Student();
        myStudentObj[2].setInfo("Kim", (byte) 20, "WestBend");

        myStudentObj[3] = new Student();
        myStudentObj[3].setInfo("Jim", (byte) 21, "Utica");

        myStudentObj[4] = new Student();
        myStudentObj[4].setInfo("Josh", (byte) 22, "Cumming");

        myStudentObj[5] = new Student();
        myStudentObj[5].setInfo("Tom", (byte) 23, "Cincinnati");

        myStudentObj[6] = new Student();
        myStudentObj[6].setInfo("Tommy", (byte) 24, "New Jersey");

        myStudentObj[7] = new Student();
        myStudentObj[7].setInfo("Sam", (byte) 25, "Tennesses");

        myStudentObj[8] = new Student();
        myStudentObj[8].setInfo("Jimmy", (byte) 26, "Florida");

        myStudentObj[9] = new Student();
        myStudentObj[9].setInfo("Miya", (byte) 27, "Oregon");


    }
}
