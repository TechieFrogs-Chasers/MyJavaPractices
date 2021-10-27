package OOPS;

public class NestedClasses {
    int num = 10;
    static String name = "Maha";
    void display(){
        System.out.println("In Display Method");
        InnerClass1 innerObj = new InnerClass1();
        innerObj.innerDisplay(innerObj);
        if(innerObj.k ==200){
            class IfInner{// Local Inner class or method local inner
                int y = 12;
                void ifInner(){
                    System.out.println("In If inner class");
                }
            }
            IfInner ifObj = new IfInner();
            ifObj.ifInner();


        }

    }
    NestedClasses(){
        System.out.println("In outer class constructor");
        InnerClass1 innerObj = new InnerClass1();// name instance
        System.out.println(innerObj.k);
        innerObj.innerDisplay(new InnerClass1());// new instance anonymous instance
        innerObj.k= 10;

    }

    private  class InnerClass1{//inner class
        float f;
        static int k;
        void innerDisplay(InnerClass1 myRef){
            System.out.println("In inner display"+name+myRef.k);
            myRef.k=200;
            class MethodLocal{//method local class
                int j = 10;
                static float h = 52;
                void methodLocal(){
                    System.out.println("In method local inner class"+h);
                    System.out.println(k+" "+f);
                }
            }
            MethodLocal metObj = new MethodLocal();
            metObj.methodLocal();

            
        }
        InnerClass1(){
            System.out.println("In inner class constructor");
            //display();
        }
    class InnerClass{// member inner class
        int k;
        String name1 = "Mounika";
        void innerClass(){
            System.out.println("In inner class method"+num);
        }

    }

    }

        public static void main(String[] args) {
        NestedClasses nesObj = new NestedClasses();// named instance
        nesObj.display();
        nesObj.name="Madhu";
        NestedClasses.InnerClass1 innObj = nesObj.new InnerClass1();
        NestedClasses.InnerClass1.InnerClass innerObj1 = innObj.new InnerClass();
        //NestedClasses.InnerClass1.InnerClass innerObj = new NestedClasses(). new InnerClass1().new InnerClass();
        //anonymous inner way
    }
    
}
