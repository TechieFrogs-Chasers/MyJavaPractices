package sindhu.src;

/*public class EncapsulationDemoNew{
    int i;
    private String name;

    public int getI(){
        return this.i;
    }
    public void setI(int i){
        this.i=i;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
class Demo{
    public static void main(String[] args) {
        EncapsulationDemoNew demObj = new EncapsulationDemoNew();
        demObj.setName("sindhu");
        demObj.setI(5);
        System.out.println(demObj.getName());
        System.out.println(demObj.getI());
    }

}*/

public class EncapsulationDemoNew{
    private  int age;
    private String name;

    public int getage(){
        return age;
    }

    public void setAge( int newAge) {
        age = newAge;
     }

     public String getName() {
        return name;
     }

     public void setName(String newName){
         name = newName;
     }

}

class Student{

public static void main(String[] args) {
    EncapsulationDemoNew Test = new EncapsulationDemoNew();
        Test.setName("sindhu");
        Test.setAge(20);
       System.out.println(Test.getName());
       System.out.println(Test.getage());
     }

   

     
}



    

   
