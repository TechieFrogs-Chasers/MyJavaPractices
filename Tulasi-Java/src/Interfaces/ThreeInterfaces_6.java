package Interfaces;


interface Elementary {//parent interface

    void firstYr1();

    void lastYr1();

}

interface MiddleSchool {
    void firstYr2();

    void lastYr2();
}

interface HighSchool {
    void firstYr3();

    void lastYr3();
}

interface County extends Elementary, MiddleSchool, HighSchool {//child interface

    void schoolEducation();

    void collegeEduction();


}


class Country {//parent class

    void diplay() {
        System.out.println("display");
    }
}


public class ThreeInterfaces_6 extends Country implements County {//child class


    @Override
    public void firstYr1() {

    }

    @Override
    public void lastYr1() {
        System.out.println("Grade-5");
    }

    @Override
    public void firstYr2() {
        System.out.println("Grade-6");
    }

    @Override
    public void lastYr2() {
        System.out.println("Grade-8");
    }

    @Override
    public void firstYr3() {
        System.out.println("Grade-9");
    }

    @Override
    public void lastYr3() {
        System.out.println("Grade-12");
    }

    @Override
    public void schoolEducation() {
        System.out.println("Grade-k-8");
    }

    @Override
    public void collegeEduction() {

    }


    void ele(Elementary E) {
        System.out.println("ElementrySchool");
        E.firstYr1();
        E.lastYr1();
    }

    void mid(MiddleSchool M) {
        System.out.println("MiddleSchool");
        M.firstYr2();
        M.lastYr2();
    }

    void Hig(HighSchool H) {
        System.out.println("HighSchool");
        H.firstYr3();
        H.lastYr3();
    }

    void sch(County C) {
        System.out.println("School");
        C.schoolEducation();
        C.collegeEduction();
    }

    public static void main(String[] args) {
        ThreeInterfaces_6 obj = new ThreeInterfaces_6();
        obj.ele(obj);
        obj.Hig(obj);
        obj.mid(obj);
        obj.sch(obj);


    }
}
