package Interfaces;

interface InnerClassInterface{
    void innerClassInterfaceMethod();
    class innerClass implements InnerClassInterface{
        void innerMethod(){

        }
        @Override
        public void innerClassInterfaceMethod() {

        }
    }
}


public class InterfaceInnerClass_8 {

    public static void main(String[] args) {
        InnerClassInterface Obj=new InnerClassInterface() {
            @Override
            public void innerClassInterfaceMethod() {

            }
        };

    }
}
