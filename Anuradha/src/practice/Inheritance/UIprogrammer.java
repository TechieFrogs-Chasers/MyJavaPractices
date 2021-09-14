package Inheritance;

public class UIprogrammer extends Programmer{
    public static void main(String[] args) {
        UIprogrammer UIobj = new UIprogrammer();
        UIobj.name = "UIProgram";
        UIobj.age = 26;
        UIobj.salary = 50000;
        UIobj.language = "French";
        UIobj.printData();
        Programmer.Data();
        UIobj.emp();

    }
    
}
