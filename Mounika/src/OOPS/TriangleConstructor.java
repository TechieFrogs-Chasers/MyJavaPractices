package OOPS;

public class TriangleConstructor {
    int side1, side2, side3;
    int area, perimeter, semiperimeter;
   
    
    public static void main(String[] args) {
        TriangleConstructor triangleConstructorObj = new TriangleConstructor(3, 4, 5);
        //triangleConstructorObj.side1 = 3;
        //TriangleConstructor triangleConstructorObj1 = new TriangleConstructor(4);
        //TriangleConstructor triangleConstructorObj2 = new TriangleConstructor(5);
        //triangleConstructorObj.side2 = 4;
        //triangleConstructorObj.side3 = 5;
        /*triangleConstructorObj.perimeter = triangleConstructorObj.side1+triangleConstructorObj.side2+triangleConstructorObj.side3;
            System.out.println("Perimeter of a Triangle when 3 sides is given : "+triangleConstructorObj.perimeter);
            triangleConstructorObj.semiperimeter = triangleConstructorObj.perimeter/2;
                System.out.println("Semi Perimeter of a Triangle when 3 sides is given : "+triangleConstructorObj.semiperimeter);
                triangleConstructorObj.area = 
                (triangleConstructorObj.semiperimeter*(triangleConstructorObj.semiperimeter-triangleConstructorObj.side1)*(triangleConstructorObj.semiperimeter-triangleConstructorObj.side2)*(triangleConstructorObj.semiperimeter-triangleConstructorObj.side3));
                    System.out.println("Area of a of a Triangle when 3 sides is given : "+triangleConstructorObj.area);
    */
    }
    //int i =0;
    TriangleConstructor(int side1, int side2, int side3){
        perimeter = side1+side2+side3;
        System.out.println("Perimeter : "+perimeter);
        semiperimeter = perimeter/2;
        System.out.println("SemiPerimeter : "+semiperimeter);
        area = semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3);
        System.out.println("Area :"+area);

    }
        
        
}

    

