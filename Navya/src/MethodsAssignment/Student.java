package MethodsAssignment;

public class Student {
    int age;
    String name;
    String address;
    Student(String name,int age , String address){
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println(name+ " "+age +" "+ address);
    }
    void setInfo(String name, int age){
        System.out.println(name +"  "+ age);
    }
    void setInfo(String name, int age, String adderess){
        System.out.println(name + " "+ age + " "+ adderess);
    }
    public static void main(String[] args) {
        Student obj = new Student("Unknown",0,"Not available");
        obj.setInfo("Navya", 22);
        obj.setInfo("Navya", 22, "Peddevam");
    }    
}
