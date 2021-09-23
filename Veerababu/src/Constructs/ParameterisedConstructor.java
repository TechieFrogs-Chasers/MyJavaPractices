package Constructs;

public class ParameterisedConstructor {
    int a;
    int b;
    public static void main(String[] args) {
        ParameterisedConstructor Parameter = new ParameterisedConstructor(); 
        System.out.println("Parameter"+" "+Parameter.a);

        Addition1 add = new Addition1(25,55);
        System.out.println("Addition"+" "+(add.a+add.b));

        Subtraction sub = new Subtraction(15,10);
        System.out.println("Subtraction"+" "+(sub.a-sub.b));

        Multiplication multiply = new Multiplication(15,15);
        System.out.println("Multiplication"+" "+(multiply.a*multiply.b));

        Division div = new Division(10,100);
        System.out.println("Division"+" "+(div.a+div.b));

    }
    ParameterisedConstructor()
    {
        a=15;
        System.out.println("Default Parameter");
    }

}

class Addition1{
    int a;
    int b;
    public static void main(String[] args) {
        Addition1 add = new Addition1();
        System.out.println("Addition of Two Numbers");
    }

    Addition1()
    {
        System.out.println("Default");
    }

    Addition1(int a, int b)
    {   
        this.a=a;
        this.b=b;
        System.out.println("In First Parameterised Constructor");
    }
}


class Subtraction{
    int a;
    int b;
    public static void main(String[] args) {
        Subtraction sub = new Subtraction();
        System.out.println("Subtraction of Two Numbers");
    }

    Subtraction()
    {
        System.out.println("Default");
    }

    Subtraction(int a, int b)
    {   
        this.a=a;
        this.b=b;
        System.out.println("In First Parameterised Constructor");
    }
}

class Multiplication{
    int a;
    int b;
    public static void main(String[] args) {
        Multiplication multiply = new Multiplication();
        System.out.println("Multiplication of Two Numbers");
    }

    Multiplication()
    {
        System.out.println("Default");
    }

    Multiplication(int a, int b)
    {   
        this.a=a;
        this.b=b;
        System.out.println("In First Parameterised Constructor");
    }
}


class Division{
    int a;
    int b;
    public static void main(String[] args) {
        Division div = new Division();
        System.out.println("Multiplication of Two Numbers");
    }

    Division()
    {
        System.out.println("Default");
    }

    Division(int a, int b)
    {   
        this.a=a;
        this.b=b;
        System.out.println("In First Parameterised Constructor");
    }
}

