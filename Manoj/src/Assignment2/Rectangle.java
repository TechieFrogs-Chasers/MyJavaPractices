package Assignment2;

public class Rectangle {
    int area,length,breadth;
    public static void main(String...args){
        Rectangle object=new Rectangle(4,5);
        object.Area(5,8); //call the method with object 

    }
    Rectangle(int a,int b){//constructor is created 
        length=a;
        breadth=b;
        area=length*breadth;
        System.out.println("area of rectangle is: " + area);
    }
    public int Area(int l, int m){ //methood is created
        length=l;
        breadth=m;
        area=length*breadth;
        System.out.println(area);
       return area;//here int is a return type so we used return to close the method 
    }
    
}
