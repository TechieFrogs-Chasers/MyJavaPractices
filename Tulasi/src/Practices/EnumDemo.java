package Practices;
enum Seasons implements InterfaceTest  {//enum is also one datatype-enums can be define outside and inside of the class .But we cant define them in methods.This enum is inside the class.enum may implement many interfaces but cannot extend any class because it internally extends Enum class.
    WINTER,SPRING,FALL,SUMMER//system implicity give; at end of the Sentence-By default that consider as public static final by complier and these will internal extends by enum class.
    ;//semi-colone by default appended by complier

    @Override
    public void valuemethod() {
        System.out.println("Enum valuemethod");
    }

    @Override
    public int privateMethod() {
        return 0;
    }

    @Override
    public boolean equals() {
        return false;
    }
    Seasons(){//by default it consider private Constructor.
        System.out.println("enum constructor");//It will print 4 times ,because for every variable it will create one constructor.
    }
}
public class EnumDemo {
    enum States{//enum inside the class
        NY,GA,WI

    }
    public static void main(String[] args) {
        Seasons[] season=Seasons.values();//they use for each loop to access the season -Its an array with value() method.We cant create instance using new keyword ,we must use then as constants like we use for interfaces
        season[0].valuemethod();//to call method in enum method we must use [] with instance.
        //season[0].ordinal();
        for (Seasons season1: season){
            System.out.println(season1.ordinal());//ordinal means kind of index-It will give there position as 0-winter,1-spring,2-fall,3-summer.
        }
        States[] states=States.values();
        for (States S1:states){
            System.out.println(S1);
        }
        System.out.println("My value is:"+""+Seasons.valueOf("SUMMER"));
    }
}
