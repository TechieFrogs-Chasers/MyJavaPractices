package OOPS;

public class Triangle {
    int side1, side2, side3;
    int area, perimeter, semiperimeter;
    public static void main(String[] args) {
        Triangle triangleObj = new Triangle();
        triangleObj.side1 = 3;
        triangleObj.side2 = 4;
        triangleObj.side3 = 5;
        triangleObj.perimeter = triangleObj.side1+triangleObj.side2+triangleObj.side3;
            System.out.println("Perimeter of a Triangle when 3 sides is given : "+triangleObj.perimeter);
            triangleObj.semiperimeter = triangleObj.perimeter/2;
                System.out.println("Semi Perimeter of a Triangle when 3 sides is given : "+triangleObj.semiperimeter);
                triangleObj.area = 
                (triangleObj.semiperimeter*(triangleObj.semiperimeter-triangleObj.side1)*(triangleObj.semiperimeter-triangleObj.side2)*(triangleObj.semiperimeter-triangleObj.side3));
                    System.out.println("Area of a of a Triangle when 3 sides is given : "+triangleObj.area);

        
    }
    
}
//perimeter formula p = a+b+c
//semi perimter formual s = a+b+c/2
// Area = sruare root of s(s-a)(s-b)(s-c)
//area = s*(s-a)*(s-b)*(s-c)

   