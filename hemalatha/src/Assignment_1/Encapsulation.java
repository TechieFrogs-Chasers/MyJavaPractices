package Assignment_1;

public class Encapsulation {
    private int age;
    private String name;

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    
    /*public static void main(String[] args) {  
            Encapsulation object = new Encapsulation();
            object.setName("hema");
            System.out.println(object.getName());
            Encapsulation objects = new Encapsulation();
            objects.setAge(12);
            //int age = objects.getAge();
            System.out.println(objects.getAge()); 
    }*/
    public class Main{
        public static void main(String[] args) {
            Encapsulation object = new Encapsulation();
            object.setName("hema");
            System.out.println(object.getName());
            Encapsulation objects = new Encapsulation();
            objects.setAge(12);
            //int age = objects.getAge();
            System.out.println(objects.getAge());
        }
        
        

        

    }
}
    

