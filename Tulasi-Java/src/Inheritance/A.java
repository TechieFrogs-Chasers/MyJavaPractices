package Inheritance;//Package

public class A {// driver class
    int i, j;

    A() {//constructor
        System.out.println("Constructor for A class");
    }

    A(int i, int j) {//parameterized constructor
        this.i = i;
        this.j = j;
    }

    public void show() {//method

        System.out.println("Method fro A class" + i + "," + j);
    }


    static class B extends A {//class B extends class A
        int k;

        B(int k) {
            this.k = k;
        }//Constructor

        public void show() {//method

            System.out.println("Method for B class-" +"Value of k:"+ k);

        }

        public static void main(String[] args) {//main method
            B myObj = new B(9);//instance for subclass
            myObj.i = 12;//call and accessing variable "i"
            myObj.j = 44;//call and accessing variable "j"
            myObj.show();//call-B class method over riding A class method
        }
    }
}