package Practices;

public class Ternerycondition {
    public static void main(String[] args) {
        int time=10;
        int clock=11;
        String output=((time<11)? "Good morning":"Good Evening");
        System.out.println(output);
    if(time>9) {
        System.out.println("breakfast time");
    }
    else{
        System.out.println("Lunch time");
    }if(time==10){
        if(clock>time) {
            System.out.println("time for dinner");
        }
        else if (time<6){
            System.out.println("Its snack time");}
        else {
            System.out.println("not time for dinner");
        }


        }
        }
    }




