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
    Rectangle(int length, int breadth ){
     this.length=length;
     this.breadth=breadth;
    }
}
class Square extends Rectangle{
     

}
class inhero {
  public static void main(String...args){
    Rectangle obj=new Rectangle(5,6);
    obj.area();
    obj.preimeter();
    }
}
    

