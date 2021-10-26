package Inheritance;

public class Just {  
    public static void main(String[] args) {
        System.out.println("hello there team");
        pig p = new pig();
        p.bark();
        p.moew();
        p.sound();
    }
}
class Dogs
{
    void bark(){
        System.out.println("barking");
    }

}
class cats extends Dogs
{
    void moew(){
        System.out.println("meowing");
    }

}
class pig extends cats
{
    void sound(){
        System.out.println("oink oink");
    }

}