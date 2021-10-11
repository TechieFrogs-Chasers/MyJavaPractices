package Abstraction;

public class Marks {
    public static void main(String[] args) {
        ClassA obj1 = new ClassA(70,75,80);
        System.out.println("The percentage of student A: "+ obj1.getPercentage()+ "%");      
        ClassB obj2 = new ClassB(87,90,98,96);
        System.out.println("The percentage of student B: "+ obj2.getPercentage()+ "%"); 
        obj2.getPercentage();
    }   
}
abstract class Marks1{
    float a,b,c,d,percent;
    abstract float getPercentage();
}
class ClassA extends Marks1{
    
    ClassA(float X,float Y,float Z){
        this.a =X;
        this.b=Y;
        this.c=Z;
    }
    float getPercentage() {
        float percent = ((a+b+c)/300)*100;
        System.out.println("the result:" + percent);
       return percent;
    }
}
 class ClassB extends Marks1{
    
    ClassB(float X,float Y,float Z,float W){
        this.a =X;
        this.b=Y;
        this.c=Z;
        this.d =W;
    }
    float getPercentage() {
        float percent = ((a+b+c+d)/400)*100;
        return percent;
    }
}
