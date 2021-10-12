import java.util.Scanner;

public class Paint {

      
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of interior walls");
        int intwalls=obj.nextInt();

        Scanner obj1 = new Scanner(System.in);
        System.out.println("Enter the number of exterior walls");
        int extwalls=obj1.nextInt();

        Scanner obj2 = new Scanner(System.in);
        System.out.println("enter the sq feet of each interior wall");
        double areaint = obj2.nextDouble();


        Scanner obj3 = new Scanner(System.in);
        System.out.println("enter the area of exterior wall in sq feet");
        double areaext = obj3.nextDouble();

        double intsurf=(areaint * 18)*intwalls;

        System.out.println("price for interior wall paint is   Rs "+intsurf);
    
        double extsurf = (extwalls)*(areaext * 12);
     
        System.out.println("price for the exterior walls is  Rs "+extsurf);

        double total = (intsurf+extsurf);
        System.out.println("total cost for painting the house is   Rs "+total);

        obj.close();
        obj1.close();
        obj2.close();
        obj3.close();
    }

    
     
       
        
       
    

}
