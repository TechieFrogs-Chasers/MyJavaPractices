package Interfaces;


interface Interface1{
    void interface1Method1();
    void interface1Method2();

    public interface Interfacepackage_3 {//Assignment-3
    }
}
interface Interface2{
    void interface2Method1();
    void interface2Method2();

}
interface Interface3{
    void interface3Method1();
    void interface3Method2();

}
interface newInterface extends Interface1,Interface2,Interface3{
    void newInterfaceMethod();

}
class classInterface implements newInterface{
    @Override
    public void interface1Method1() {
        System.out.println("Interface- 1 and Method- 1");
    }

    @Override
    public void interface1Method2() {
        System.out.println("Interface- 1 and Method- 2");
    }

    @Override
    public void interface2Method1() {
        System.out.println("Interface- 2 and Method- 1");
    }

    @Override
    public void interface2Method2() {
        System.out.println("Interface- 2 and Method- 2");
    }

    @Override
    public void interface3Method1() {
        System.out.println("Interface- 3 and Method- 1");
    }

    @Override
    public void interface3Method2() {
        System.out.println("Interface- 3 and Method- 2");
    }

    @Override
    public void newInterfaceMethod() {
        System.out.println("newInterface- 1 and Method- 1");
    }


}
public class ThreeInterfaces_6 {
    public static void main(String[] args) {

    classInterface interfaceObj=new classInterface();
    interfaceObj.interface1Method1();
    interfaceObj.interface1Method2();
    interfaceObj.interface2Method1();
    interfaceObj.interface2Method2();
    interfaceObj.interface3Method1();
    interfaceObj.interface3Method2();
    interfaceObj.newInterfaceMethod();


    }
}
