package university;
public class Encapsulation {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
        obj.setA(8);
        System.out.println(" the valu of a is : " + obj.getA());     
        
        System.out.println("the value of name: " + obj.getName());   
        obj.setName("Dhivya");
        System.out.println("the value of name: " + obj.getName());  
    }
}
class Demo{
    private int a =10;
    public int getA() {
       return a;
    }
    public int setA(int a1) {
        this.a = a1;
        return a;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name = "Encapsule";
    public void display()
    {
        System.out.println("The name of the private variable is :" + name +" "+ a);
    }
}