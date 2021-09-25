package Assignment_1;
import java.util.Scanner;

/*public class Average8 {
    int a,b,c,average;
    Average8(int a,int b,int c)
    { 
        System.out.println("enter first number:"+a);
        System.out.println("enter second number:"+b);
        System.out.println("enter third number:"+c);
    
    }
    void display()
    {
         average=((a+b+c)/3);
        System.out.println("average of three numbers:"+average);
    }
public static void main(String[] args) {
    Average8 obj = new Average8(2,6,7);
    obj.display();
}
}*/
public class Average8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first value:");
        int a = Average8.display(sc);
        System.out.println("enter the second value:");
        int b = Average8.display(sc);
        System.out.println("enter the third value:");
        int c = Average8.display(sc);
        int average = (a+b+c)/3;
        System.out.println(" average of three numbers:"+average);
        sc.close();
    }
    static int display(Scanner sc){
    int num;
do{
    System.out.println("enter the positive number");
    while(!sc.hasNextInt())
    {
    System.out.println(" this is not positive number enter the valid number:");
    sc.next();
    }num=sc.nextInt();
    }while(num<=0);
    return num;
}
}


    


    

    








    




