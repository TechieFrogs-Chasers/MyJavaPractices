package Practices;

public class Programming {
    final static String projectname;//final static variable
    int numofprojects;//instance variable
    char projectindex;//instance variable
    boolean projectlive;

    static {//static block
        projectname= "Javaprojects";
    }

    {//instance block
    numofprojects=11;
    projectindex='A';
    }

    public static void main(String[] args) {//main
        int live=9;//local variable
        byte done=2;
        int unapproved=4;
        Programming pro1=new Programming();//instance object
        pro1.numofprojects=14;
        if (live<done)
            System.out.println("more projects r in live");
        else if (unapproved<done){
            System.out.println("time is less");
        }
        else {
            System.out.println((live - unapproved) > (live - done));

        }

    }
}
