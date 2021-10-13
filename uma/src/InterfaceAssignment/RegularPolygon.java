public interface RegularPolygon {
    
    
    int getNumSides();

    int getSideLength();

    default int getPerimeter(){

        int length=5;
        int n= 6;
        int p = (n *length);
        return p;
    }
    default int getInteriorAngle(){
        return 10;
    }
    
}

class EquilateralTriangle implements RegularPolygon{


    int length;
  public int getNumSides(){
      
      return 3;
  }


  public int getSideLength(){
      System.out.println(this.length);
      return length;
    
  }

    EquilateralTriangle(int l){
     length=l;
     l=5;

    }

    public static void main(String[] args) {
        EquilateralTriangle objEquilateralTriangle = new EquilateralTriangle(5);
        objEquilateralTriangle.getPerimeter();
        
    }

}
class Square implements RegularPolygon{

    int length;

    public int getNumSides(){
     return 4;
    }

    public int getSideLength(){
     return length;
    }
    Square(int length){
    this.length= 5;

    }

    static int totalSides(){
    int sum=4*4;
     return sum;
      
    }

 


}
