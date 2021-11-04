package Practices;

interface Forest{
    default void forest_Int(){
        System.out.println("default interface");

    }
}
abstract class Animals{
    abstract void animalMethod();
    Animals(){
        System.out.println("Constructor");
    }
}
interface Food{
    void foodMethod();
}
interface foodForest extends Food , Forest{


}
class Abstract_inter extends Animals implements foodForest{

    @Override
    public void forest_Int() {
        foodForest.super.forest_Int();
    }

    @Override
    public void foodMethod() {
        System.out.println("Interface food method");
    }

    @Override
    public void animalMethod() {
        System.out.println("Abstract method");
    }
}
class Pets{
   foodForest food_forest;

    Pets(foodForest food_forest){

        this.food_forest=food_forest;
    }

    void method() {
        System.out.println("Method");
        food_forest.forest_Int();
    }
    void method2(){
        System.out.println("Method2");
        food_forest.foodMethod();
    }
}
public class Interface_Abstract {
    public static void main(String[] args) {
        Abstract_inter obj=new Abstract_inter();
        obj.animalMethod();
        obj.foodMethod();
        obj.forest_Int();

        Pets obj1=new Pets(obj);
        obj1.method();
        obj1.method2();


    }
}
