package OopsConcepts;

class Rectangle{
  int l,w,l1,w1;

  public int area1(){
  w=4;
  l=5;
 int a1=(l*w);
 return a1;
  }

 int area(){
    w1=5;
    l1=8;
    int a2=(l1*w1);
   return a2;
}

Rectangle(int le,int br){
l=le;
w=br;
System.out.println(le+" "+br);
}
public static void main(String[] args) {
    
Rectangle rObj =new Rectangle(5,8);
rObj.area1();
System.out.println("area of first triangle is " +rObj.area1());
Rectangle rObj1 =new Rectangle(4,5);
System.out.println("area of second triangle is " +rObj1.area());
}
}
















public class RectExcercise {
    
}
