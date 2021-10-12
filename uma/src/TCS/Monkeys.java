import java.util.Scanner;

public class Monkeys {

   
    
public static void main(String[] args) {

    int monkeys;
    int peas;
    int bananas;
    
Scanner obj = new Scanner(System.in);

System.out.println("enter the number of monkeys");
//int m = obj.nextInt();
int m=Monkeys.validate(obj);  //validation of number

System.out.println("max number of bananas a monkey can eat");
 //obj.nextInt();
 Monkeys.validate(obj);

System.out.println("max number of peanuts a monkey can eat");
 //obj.nextInt();
 Monkeys.validate(obj);

System.out.println("total number of bananas");
//int tb = obj.nextInt();
int tb= Monkeys.validate(obj);
bananas=tb/2;

System.out.println("enter total number of peanuts");
//int tp = obj.nextInt();
int tp = Monkeys.validate(obj);

peas=tp/3;
monkeys=m-(bananas+peas);
System.out.println("left over monkeys on the tree are  "+monkeys);

obj.close();

}

public static int validate(Scanner obj){
    int num;
    do{
        System.out.println("enter valid number:");
       while(!obj.hasNextInt() ){
           obj.next();
           System.out.println("not a valid number");
         }
         num=obj.nextInt();
       } while(num<=0);
    return num;
}
    
}
