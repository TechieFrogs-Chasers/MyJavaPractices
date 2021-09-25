import java.lang.*;

public class Rectangle {
     int length, breadth,area;
     Rectangle(int l, int b){
       //this.length=length;
       //his.breadth=breadth;
        //this.area = length*breadth;
        length= l;
        breadth=b;
        area= l*b;
    }
    void Area(){
        System.out.println("The area of the rectangle is : "+ area+"  length is:" +length +" & breadth is: " +  breadth );
    }

    public static void main(String[] args) {
         Rectangle data1 = new Rectangle(4,5);
         Rectangle data2 = new Rectangle(5,8);
         data1.Area();
         data2.Area();
    }  
    }
    

