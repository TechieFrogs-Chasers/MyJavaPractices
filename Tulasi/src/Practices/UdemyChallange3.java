package Practices;

public class UdemyChallange3 {
    public static void main(String[] args) {
        double myfirstvar=20.00d;
        double mySecvar=80.00d;
        double sumoffirstandsec=(myfirstvar+mySecvar)*100.00d;
        System.out.println(sumoffirstandsec);
        double remainder=sumoffirstandsec%40.00;
        boolean remzero;
        remzero = (remainder==0)?true:false;
        if (remzero == false)
        {
            System.out.println("Got some remainder");
        }
    }
}
