package OopsAssignment;
class Rectangle{
    int l,w,l1,w1;
  
    public int area(){
    w=4;
    l=5;
   int a=(l*w);
   System.out.println("area of first triangle is " +a);
   return a;
  
    }
  
   int area2(){
      w1=5;
      l1=8;
      int a1=(l1*w1);
      System.out.println("area of second triangle is "+a1);
     return a1;
  }
  
  Rectangle(int length,int breath){
  l=length;
  w=breath;
  System.out.println("length is  "+length+" "+ "breadth is  "+breath);
  }
  public static void main(String[] args) {
      
  Rectangle myObj =new Rectangle(5,8);
  myObj.area2();
  
  Rectangle myObj1 =new Rectangle(4,5);
  myObj1.area();
  }
  }