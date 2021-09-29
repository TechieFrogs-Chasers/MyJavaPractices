

//package sindhu.src.OOPs.Assignment;

public class StaticNestedClass 
{
    int i=10;
    static String name;

    void Display()
    {
        System.out.println("in my method");
    }

    static class StaticInner
    {
        int k;
        static int l;

        void displayMethod()
        {
            System.out.println("in first non-static method"+ " "+ "name");
        }

        void displayMethod1()
        {
            System.out.println("in first static method");
            StaticNestedClass x = new StaticNestedClass();
            System.out.println(StaticNestedClass.name);
        }

        static class Student
        {
            int h;
            static int o;

            void find()
            {
                System.out.println("method");
            }

            public class Student1 {
            }
        }

        static class Student1
        {
            static int g;
            {
                g=15;
            }
            void find1()
            {
                System.out.println("method1");
            }
        

            public static void main(String[] args) {
                Student y = new Student();
                y.find();

                


               
                
             }
             
    }


    
    public static void main(String[] args) {
        StaticNestedClass x = new StaticNestedClass();
        x.Display();
       StaticInner y = new StaticInner();
        System.out.println(y.k);

        //Student1 y1 = new student1();
        //y1.find1();
    
        
    }

        

        
    }

    
}
