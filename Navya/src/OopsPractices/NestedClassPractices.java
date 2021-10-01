package OopsPractices;

public class NestedClassPractices {
    int a = 2;
    static String name = "navya";
    void dispaly(){
        System.out.println("display outer class method "+name +" "+a );
        InnerNestedClassPractices myObj = new InnerNestedClassPractices();
        myObj.name( );
         InnerNestedClassPractices.NestInnerNestedClassPractices myNestInnerobj =myObj.new NestInnerNestedClassPractices();
        myNestInnerobj.nestInnerMethod();
    }

    /**
     * InnerNestedClassPractices
     */
     class InnerNestedClassPractices {
    int i = 3;
     static int j = 8;   
     void name(){
        System.out.println("display inner class method "+ name +" "+ i+" "+a+ " "+j);
        
        //dispaly();
     }
        class NestInnerNestedClassPractices {
         int n = 8;
         double g = 8.7d;
         static int l = 8;
             void nestInnerMethod(){
             System.out.println("dispaly nest Inner method "+ g + " "+ a+" "+ j );
                 class InnerMethod{
                
                int c = 8;
                     void methodDispaly(){
                     System.out.println("display class in inner class method " + c);
                     }
                }
                InnerMethod objMethod = new InnerMethod();
                objMethod.methodDispaly();
            }
        }
    }
    public static void main(String[] args) {
        NestedClassPractices outerObj = new NestedClassPractices();
        outerObj.dispaly();
       NestedClassPractices.InnerNestedClassPractices innerObj = outerObj.new InnerNestedClassPractices();
      //  innerObj.name();
        NestedClassPractices.InnerNestedClassPractices.NestInnerNestedClassPractices nestInnerObj = innerObj.new NestInnerNestedClassPractices();
        //nestInnerObj.nestInnerMethod();
    }
 }
