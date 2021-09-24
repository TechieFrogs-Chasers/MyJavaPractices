 class Manoj{
     int k;
    public void javaclass(){
        Manoj obj=new Manoj(); //object 
        obj.k= 56;
        System.out.println(obj.k);
    }
    
}
 class Manojjava{   //we can't able to give the public to the class its actually given to the main driven class
     int r; 
      float g;
      void display(){
     Manojjava objt=new Manojjava();
    objt.r=25;
     System.out.println("display method "+ objt.r);

 }
}

public class Oopspratice {
    int i,j,l ;
    float f=3.06f;
    void display(){

        System.out.println("display method ");

    }
    public static void main(String...args){     // created the main method inside the  class
        Oopspratice object=new Oopspratice(); //creatd an object here //new is the keyword to create a object 
         int d=20; 
         float f=2.5f;
        
        Oopspratice objt=new Oopspratice();
        Oopspratice object2=new Oopspratice();
        
        object.display();
        object.i=35;        //here i is a staic one and the object is reading it 
        object2.j=50;
        object2.l=20;
        System.out.println(object.i + " " + object2.j+ "  " +d + " " + f + " " + objt.f);
        System.out.println(object2.l);

         Manojjava obj=new Manojjava();
         
          obj.g=3;   //here g is taken from the class Manojjava  
          //instance should be created in that particular file 
         
         System.out.println(obj.g);
         
    }
    
}
class Car{
    String j; 
    void speed(){
        Car refobj=new Car();
      refobj.j="max";
        System.out.println( refobj.j);
    }

}
