package Assignment_1;

/*public class Area6 {
   int length;
    int breadth;
    int area;
    Area6(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
        System.out.println("rectangle details:");
    }
    void setDim(){
    System.out.println("rectangle length = " +length);
    System.out.println("rectangle breadth = " +breadth);
    }
    void getArea()
    {
        area=length*breadth;
        System.out.println("rectangle area = "  +area);

    }   

public static void main(String[] args) {
    Area6 ar1 = new Area6(5,4);
    ar1.setDim();
    ar1.getArea();

    
}
}*/
public class Area6 {
    int length;
    int breadth;
    int area;
    Area6()
    {
        this(5,6);
        System.out.println("rectangle");
    }
    Area6(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void setDim()
    {
        System.out.println("rectangle length = " +length);
        System.out.println("rectangle breadth = " +breadth);
    }
    void getArea()
    {
        area=length*breadth;
        System.out.println("rectangle area = "  +area);

    }     

    public static void main(String[] args) {
    Area6 r1 = new Area6();
    r1.setDim();
    r1.getArea();
    }


}
