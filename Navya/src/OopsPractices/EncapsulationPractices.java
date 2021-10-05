package OopsPractices;
public class EncapsulationPractices {
     int a ;
     private String name;
     protected int j ;
     /*public String getString(){
         return name;
     }
     public void setString(String name){
        this.name = name;
     }
     public int getNumber(){
         return a ;
     }
     public void setNumber(int a){
         this.a = a;
     } */

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJ() {
        return this.j;
    }

    public void setJ(int j) {
        this.j = j;
    }
     
    public static void main(String[] args) {
        EncapsulationPractices instanceObj =  new EncapsulationPractices();
        instanceObj.name =" navya";
        System.out.println(instanceObj.a +" "+instanceObj.name+" "+instanceObj.j);
    }
}
class Encapsulation  {    
    public static void main(String[] args) {
        EncapsulationPractices instanceObj1 = new EncapsulationPractices();
        instanceObj1.setName("navya");
        System.out.println(instanceObj1.getName());
        instanceObj1.setJ(6);
        System.out.println(instanceObj1.getJ());
        instanceObj1.setA(7);
        System.out.println("print j : "+instanceObj1.j);
        System.out.println(instanceObj1.getA()+" "+instanceObj1.getName()+" "+instanceObj1.getJ());
    }
}