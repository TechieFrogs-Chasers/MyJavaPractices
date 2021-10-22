package Interfaces.sub3;

import Interfaces.sub1.Interface1;
import Interfaces.sub2.Interface2;


public class Interface3 extends Interface2 {
    public Interface1 dismethod(Interface3 In){
        Interface2.Innerclass innObj= In.new Innerclass();
        return innObj;
    }

    public static void main(String[] args) {
        Interface3 int3Obj=new Interface3();
        System.out.println(int3Obj.dismethod(int3Obj));
    }
}
