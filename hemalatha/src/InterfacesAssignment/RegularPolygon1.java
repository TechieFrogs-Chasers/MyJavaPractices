package InterfacesAssignment;

    interface RegularPolygon {  //interface
        public abstract int getNumSides(); //abstract method
        public abstract void getSideLength(int i);  //abstract method
        static void totalSides(){
            System.out.println("sum of the number of sides of all the elements");
        }
        default int getperimeter(int n, int length){  //default method
           int perimeter = n*length;
           System.out.println(" perimeter:"+perimeter);
           return perimeter;
        }
        default int getInteriorAngle(int n){   //default method
            int angle = 180/n;
            System.out.println(" InteriorAngle:"+angle);
            return angle;
        }   
    }
    class EquilateralTriangle implements RegularPolygon{
        public static final  int i=3;
        public int getNumSides(){
            System.out.println("EquilateralTriangle return :" +i);
            return i;
        }
        public void getSideLength(int j){
             System.out.println("EquilateralTriangle by constructor:" +j); 
        }
    }
    
    class Square implements RegularPolygon{
        public static final  int i=4;
        public int getNumSides(){
            System.out.println("Square return :" +i);
            return i;
        }
        public void getSideLength(int j){
            System.out.println("Square by constructor:" +j);
        }
    
    public static void main(String[] args) {
        EquilateralTriangle eqt = new EquilateralTriangle();
        eqt.getNumSides();
        eqt.getSideLength(8);
        eqt.getperimeter(5,6);
        eqt.getInteriorAngle(7);
        Square s1 = new Square();
        s1.getNumSides();
        s1.getSideLength(6);
        s1.getperimeter(2,3);
        s1.getInteriorAngle(2);
        RegularPolygon.totalSides();
        
    }
    }
    
    
    
    
    
        
    
        
    
    

    

