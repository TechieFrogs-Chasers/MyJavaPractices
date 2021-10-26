package OOPS;

public class StaticNestedClass {
    int i;
    static String name = "Mouni";

    void display(){
        int f=40;
        System.out.println("In outer display"+i);
    }
    StaticNestedClass(){
        int g=50;
        System.out.println("In static class constructor");
    }
    static class StaticInnerClass{
        int j =20;
        int k = 30;
        StaticInnerClass(){
            StaticNestedClass Obj = new StaticNestedClass();
            Obj.display();

        }

        void innerDisplay(){
            System.out.println("In Non static inner display method");
            StaticNestedClass Obj = new StaticNestedClass();
            Obj.display();
        }
        static void staticInnerdisplay(){
            StaticNestedClass Obj = new StaticNestedClass();
            System.out.println("In static inner display"+Obj.i);
        }
        static class InnerMost{
            int l = 45;
            static int w = 82;

            void innerMost(){
                System.out.println("In inner most class method");
            }
            class MostInner{// non static class
                int j=25;
                
                void mostInner(){
                    System.out.println("non static class method");
                }

            }

        }
        public static void main(String[] args) {
            InnerMost inObj = new InnerMost();
            inObj.innerMost();
            StaticInnerClass satObj = new StaticInnerClass();
            InnerMost.MostInner mostObj = inObj.new  MostInner();
            mostObj.mostInner();


            
        }


    }
    public static void main(String[] args) {
        StaticNestedClass Obj = new StaticNestedClass();
        Obj.display();
        StaticInnerClass saObj = new StaticInnerClass();
        saObj.innerDisplay();
       // saObj.staticInnerdisplay();
       StaticInnerClass.staticInnerdisplay(); 
       //both above line and this is same as staticInnerDisplay is a sttaic menthods we called it using class name


      
        
    }
    
}
