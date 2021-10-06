package OopsPractices;
public class StaticNestedClassPractices {  
    int i = 5;
    private String name = "navya";
    static double d = 7.89d;
      static class StaticInnerClass{
        void display(){
            System.out.println("dispaly of non-static method in static class " +d);
        }
       static void methodDisplay(){
        StaticNestedClassPractices staticObj = new StaticNestedClassPractices();
        System.out.println("dispaly of static method in static class "+staticObj.i +" "+staticObj.name);
        }
         static class StaticInnerMost{
            int a = 5;
            int b = 4;
             void innerMostStaticDisplay(){
                StaticInnerMost innerMostObj = new StaticInnerMost();
                System.out.println(innerMostObj.a + innerMostObj.b );
                 class staticMethodInner{
                     static int n ;
                }
                System.out.println("print n value: "+staticMethodInner.n);
            }
              StaticInnerMost(){
                System.out.println("static inner class constructor");
            }
        }
        public static void main(String[] args) {
         StaticInnerClass.methodDisplay();
         StaticInnerMost innerMostObj = new StaticInnerMost();
         innerMostObj.innerMostStaticDisplay();         
        }
    }
    public static void main(String[] args) {
        StaticInnerClass staticInnerObj = new StaticInnerClass();
        staticInnerObj.display();        
    }
}
