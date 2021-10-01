package Practices;

public class Encapsulation {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encapsulation encapsulationObj=new Encapsulation();
        encapsulationObj.setAge(22);
        encapsulationObj.setName("Shah");
        System.out.println("Age: "+ encapsulationObj.age +" , "+ "Name: " + encapsulationObj.name);

    }
}
