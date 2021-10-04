package Practices;//Package

class University {//Grandclass
    private int numColleges;
    int num = 20;

    void univeristyname() {//method for grandclass
        System.out.println("University Name");
    }

    University() {//If a grand class has any constructor bydefault for subclass,while we create instance to the subclass
        //by default first line is "super" ,when they are in the inheritance relationship
        //**If your superclass constructor is having private access modifier ,we cant create instance of our subclass.If not makesure atleast having one non-private constructor for all above superclasses.
        System.out.println("University details");
    }
}

class College extends University {//Parent class-mainclass
    private String name;
    int num = 5;

    void collegeName() {//mainclass method-We can access methods of subclass instance
        System.out.println("College Name ");

    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    protected void DegreeDetails() {
        System.out.println("Protected details");

    }


   final class CollegeDetails {//static class in side main class
        int numOfCourses;

        void DegreeDetails() {//method for static class
            System.out.println("Number of courses in college ");
        }
    }

    College() {//main class constructor-Constructor will call by creating Object.But in inheritance we create Obj for Subclass(childclass).we cant call the mainclass(superclass) constructor because constructor is not a property or member,we cant access the main class.
        // If we create an instance of subclass,constructor will executes subclass constructor and bydefault it executes mainclass constructor also.
        //super();//by default complier will do-If super is having multiple constructors ,then we ecplicity call parameter constructor.
        System.out.println("Courses Names");

    }

    College(int number) {//Parameterized Constructor
        this();//If I want to do chaining in my own class,then we use "this",If we want to chain here to superclass will use "Super".
        System.out.println("Number of Sessions: " + super.num);

    }
}

//class Colleges extends College.CollegeDetails{}//Error ,because CollegeDetails class had final keyword.

class Degree extends College {//Subclass
    int numOfDegreeCourses;
    int num = 10;

    public void DegreeDetails() {//method for subclass
        System.out.println("Degree ");
        super.DegreeDetails();
    }

    Degree() {//Control goes to the childclass constructor first ,but it executes parent class constructor first.
        super(6);//we do chaining to the super call constructor-for parameterized constructors we need to call explicitly.
        System.out.println("Degree courses details: " + this.num + "," + super.num);//If we have same name variables like num.. ,first it look into this own class(subclass) and executes it.If subclass doesnot have variable it looks in its superclass or grand class and exexcutes.
        //If want both super and subclass values ,we use "this"and "super".this will executes its own class value and super executes its super class value.When we call "super.num" it call immediate super class only.we can not call grandclass.
    }
}

public class SuperInheritance {//Driver class

    public static void main(String[] args) {//main method
        Degree myObjDegree = new Degree();//Instance for subclass-If we create instance for the subclass which is in the multiple level inheritance the top level constructor will be executed first.By default the keyword is "super".
        //First executes super class constructors-line 13,line-47(default constructor),line-53(Parameterized constructor),line-67(subclass constructor)--> Constructors calls from Top to bottom.
        //Second executes methods -line 62(Subclass method),line-23(Parent class),line-7 (super class)-methods call from bottom to top.
        //Setters and getters
        //We cannot accesss "this" and "super" in main method or any of the static contest.
        //If we have same for methods first it calls from its own class.Then it goes to parent and then it checks grandclass and executes.(Bottom to top)
        myObjDegree.DegreeDetails();
        myObjDegree.collegeName();
        myObjDegree.univeristyname();
        myObjDegree.setName("North forsty ");
        System.out.println("University name: " + myObjDegree.getName());
    }
}
