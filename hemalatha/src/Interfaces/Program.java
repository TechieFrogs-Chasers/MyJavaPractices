package Interfaces;
/* default method in interface */

 interface Program {
    void dance();
    default void msg(){
        System.out.println("default program");
    }
}
class Performance implements Program{
    public void dance()
    {
        System.out.println("dance program");
    }
}
class DefaultDemo{
    public static void main(String[] args) {
        Program prg = new Performance();
        prg.dance();
        prg.msg();
    }
}
    

