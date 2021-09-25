package Assignment_1;

public class Area7 {
    int length;
    int breadth;
    int area;
    Area7()
        {
            this(7,8);
            System.out.println("rectangle");

        }
        Area7(int length,int breadth)
        {
            this.length=length;
            this.breadth=breadth;
            System.out.println("length:"+length);
            System.out.println("breadth:"+breadth);
        }
        void returnArea()
        {
            area=length*breadth;
            System.out.println("area:" +area);
        }
            



    public static void main(String[] args) {
        Area7 a4 = new Area7();
        a4.returnArea();
        }
    }

    

