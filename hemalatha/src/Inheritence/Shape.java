package Inheritence;

public class Shape {
    void print()
    {
        System.out.println("This is This is shape :");
    }
}
    class Rectangle1 extends Shape{
        void sub()
        {
            System.out.println("This is rectangle shape");
        }
    }
        class Circle extends Shape{
            void add()
            {
                System.out.println("This is circle shape");
            }
        }
        class Square1 extends Rectangle1{
            void cool()
            {
                System.out.println("This square is rectangle");
            }
        
        public static void main(String[] args) {
            Square1 obj = new Square1();
            obj.print();
            obj.sub();
            obj.cool();


            
        }

    }


    
    

