package Abstract;//Package

abstract class Marks{//abstract class
    float Maths,English,Computers,Telugu,Percentage;//Variables
    abstract float getPercentage();//abstract method ,method should not have body
}
class StudentA extends Marks{//First subclass

    StudentA(int Maths,int English,int Computers){//Constructor with three parameters
        this.Maths=Maths;
        this.English=English;
        this.Computers=Computers;
    }
    float getPercentage(){//method
        Percentage=((Maths+English+Computers)/300)*100;
        return Percentage;
    }
}

class StudentB extends Marks{//Second subclass
    StudentB(int Maths,int English,int Computers,int Telugu){//Constructor with four parameters
        this.Maths=Maths;
        this.English=English;
        this.Computers=Computers;
        this.Telugu=Telugu;
    }
    float getPercentage(){//method
        Percentage=((Maths+English+Computers+Telugu)/400)*100;
        return Percentage;
    }
}
public class MarksDetails {//Driver class

    public static void main(String[] args) {//main method
        StudentA studentAObj=new StudentA(66,65,77);//call for first subclass
        System.out.println("Student A % : "+ studentAObj.getPercentage());
        StudentB studentBObj=new StudentB(77,65,78,99);//call for second subclass
        System.out.println("Student B % : "+ studentBObj.getPercentage());
    }
}
