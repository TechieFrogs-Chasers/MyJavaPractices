package OopsConcepts;

import java.util.Scanner;

public class AddDistance {
    

public static void main(String[] args) {
    
    int i;
   double f;
    Scanner sc = new Scanner(System.in);
   System.out.println("enter the distance in inches");
     i=sc.nextInt();
    System.out.println("enter the distance in feet");
     f=sc.nextInt();
    AddDistance obj = new AddDistance();
    obj.add(i, f);
  
  
  sc.close();
}

double add(int i,double f){

    double f3=i%12;
     double f1=i/12;
    double sum =f+f1;
    
    if (i>=12 && f1==0)
    
    System.out.println("total distance is   "+sum+"   ft");
    else
   System.out.println("total distance is  "+sum+ "ft and "+f3 +" inches");
    
    return sum;
}


}
