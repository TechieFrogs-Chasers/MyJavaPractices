package sindhu.src.TCS;


import java.util.Scanner;

public class Walls {
  static  float x,x1,x2,x3,x4,x5,x6;
  static  float y,y1,y2,y3;
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("number of interior walls");
        int n1 = input.nextInt();
        

            if(n1>0){
        

        System.out.println("surface area of first interior wall");
        float x1 = input.nextFloat();
        System.out.println("surface area of second interior wall :");
        float x2 = input.nextFloat();
        System.out.println("surface area of third interior wall");
        float x3 = input.nextFloat();
        System.out.println("surface area of fourth interior wall");
        float x4 = input.nextFloat();
        System.out.println("surface area of fifth interior wall");
        float x5 = input.nextFloat();
        System.out.println("surface area of sixth interior wall");
        float x6 = input.nextFloat();

        

       
        }
        else{
            System.out.println(" user dont want to paint interior walls");
        }

       

        System.out.println("number of exterior walls");
        int n2 = input.nextInt();
        if(n2>0){


        System.out.println("surface area of first exterior wall");
        float y1 = input.nextFloat();
        System.out.println("surface area of second exterior wall :");
        float y2 = input.nextFloat();
        System.out.println("surface area of third exterior wall");
        float y3 = input.nextFloat();

        


        }
        
else {

            System.out.println("user dont want to paint exterior wall");
        }
    
        float x = (x1+x2+x3+x4+x5+x6)*18;

        
        System.out.println("total cost of painting interior wall"+x);
        float  y = (y1+y2+y3)*12;
        
        
    System.out.println("total cost of painting exterior wall"+" "+y);
    float z = x+y;

      System.out.println("Total estimated Cost:"+ " "+ z);

       

        
        
        
        
       


    
      input.close();
    

    }
}
    

