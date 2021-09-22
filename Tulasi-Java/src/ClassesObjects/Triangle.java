package ClassesObjects;

public class Triangle {//class
    Triangle() {//Construtor
        int a = 3, b = 4, c = 5;//Datatypes&Varaibles
        System.out.println("Area of traingle is :" + a * b * c);
        System.out.println("Perimeter of traingle is :" + a + b + c);
    }

    public static void main(String[] args) {//main method
        Triangle myConstructorObj = new Triangle();//Create an obj of Traingle Constructor


    }

}
