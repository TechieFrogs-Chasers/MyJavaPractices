package sindhu.src.Google;

import java.util.Scanner;

public class Area {
    int l,b;

    void setDim(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter value of length");
        int l = input.nextInt();
        System.out.println("enter value of breadth");
        int b = input.nextInt();
        System.out.println("length of rectangle" +l);
        System.out.println("breadth of rectangle" + b);
    }
        
    

    void getArea(int l , int b){
       
        
        int getArea = l*b;

       System.out.println("area of rectangle" + getArea);
    }
    
    


    public static void main(String[] args) {
        Area x = new Area();
        x.setDim();
        
        
        x.getArea(4,5);
       
 }



 Area(){
     System.out.println("default constructor");
 }


    
}


//7th problem


/*public class Area {
    int l;
    int b;
    

    void returnArea(){
        int returnArea = l *b;
        System.out.println(returnArea);
      }
    
      

    
    public static void main(String[] args) {
        Area x = new Area();
        x.l =3;
        x.b=4;
        System.out.println(x.l);
        System.out.println(x.b);
        x.returnArea();
    }

    Area(){
        System.out.println("default constructor");
    }


}*/
