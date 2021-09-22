package Practices;

public class Lab {
    static int totalemp = 120;//Static variables+ int datatype
    final static String labname;// final static variable+ string datatype
    char unitnum = 'h';//char datatype --\u0000 to \uffff
    static long turnover;//long datatype --9223372036854775808 to 9223372036854775808
    boolean income = true;//boolean datatype --true or false
    static//static initialisation block
    {
        labname = "Dr.Reddys";
        turnover = 26200000;
    }
    int salary = 90000;//instance variable-- -2147483648 to 2147483648
    short managementcost = 32000;//short datatype-- -32768 to 32767
    long factorycost;
    byte factoryunits;
    { //initialisation block
        factorycost = 92358;
        factoryunits = 6;
    }
    static public void main(String... args) {
        float labtemp1 = 5.1f;//local variable + float datatype -- 6 to 7 decimals
        double labtemp2 = 16.5d;//double datatype -- 15 decimals
        System.out.println("Temp at lab =" + (labtemp2 - labtemp1));
        Lab obj1 = new Lab();//Object creation for the class to access instance
        obj1.factorycost = 94000;
        Lab obj2 = new Lab();
        obj2.managementcost = 30000;
        Lab obj3 = new Lab();
        obj3.factoryunits = 7;
        Lab obj4 = new Lab();
        obj4.income = false;
        System.out.println("labname=" + labname);
        System.out.println("Employee total" + "=" + totalemp);
        System.out.println("Turnover" + "=" + (int) turnover);
        System.out.println("Factorycost" + "=" + obj1.factorycost);
        System.out.println("Managementcost" + "=" + obj2.managementcost);
        System.out.println("Factoryunits" + "=" + obj3.factoryunits);
        System.out.println("Employee salaries=" + totalemp * obj1.salary);
        System.out.println("Income=" + obj4.income);
        obj4.lab1();//call lab1 to main()
    }
    public void lab1() {
        char unitnum = 'H';
        System.out.println(unitnum + "=" + (int) unitnum);
    }
}

