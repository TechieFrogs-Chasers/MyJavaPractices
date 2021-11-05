package Practices;

public class Encapsulation {
    private int age;
    private String name;
    protected char letter;

    public int getAge() {//read only access
        return age;
    }

    public void setAge(int age) {//modifiy access
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getLetter() {
        return letter;
    }

    public void setletter(char letter) {
        this.letter = letter;
    }

    public static void main(String[] args) {
        Encapsulation encapsulationObj=new Encapsulation();
        encapsulationObj.setAge(22);
        encapsulationObj.setName("Shah");
        encapsulationObj.setletter('P');
        System.out.println("Age: "+ encapsulationObj.age +" , "+ "Name: " + encapsulationObj.name +" , "+"Letter: "+encapsulationObj.letter);

    }
}
