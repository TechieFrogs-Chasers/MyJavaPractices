package Assignment3;

public class Rectangle {
    int length;
    int breadth;
    void area(){
        System.out.println("area:"+(length*breadth));
    }
    void preimeter(){
        System.out.println("perimeter:"+ 2*(length+breadth));
    }

   /* Rectangle (){   
    }*/

    Rectangle(int length, int breadth ){
     this.length=length;
     this.breadth=breadth;
    }
}
class Square extends Rectangle{
      int a;
      Square(int side){
          super(5,5);
          a=side;
      }
      void squarea(){
          System.out.println("area of a square:"+(a*a));
      }
      void squperimeter(){
          System.out.println("perimeter of square: "+ 4*a);
      }
     

}
class inhero {
  public static void main(String...args){
    Square obj=new Square(5);
    obj.area();
    obj.preimeter();
    obj.squarea();
    obj.squperimeter();

    }
}
    

