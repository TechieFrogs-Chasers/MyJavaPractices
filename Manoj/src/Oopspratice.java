class Manoj{
     int k;
    void javaclass(){
        Manoj obj=new Manoj();
        obj.k= 56;
        System.out.println(obj.k+" manoj variable");
    }
    
}
 class Manojjava{
     int r;
      void display(){
     int r;
     Manojjava objt=new Manojjava();
     objt.r=45;//r is a local variable and its not reading 
     System.out.println(objt.r);

 }
}

public class Oopspratice {
    int i,j ;
    public static void main(String...args){     // created the main method inside the  class
        Oopspratice object=new Oopspratice(); //creatd an object here
         int d=20; 
        //new is the keyword is used to create the object 
        Oopspratice object2=new Oopspratice();
        object.i=35;        //here i is a staic one and the object is reading it 
        object2.j=50;
        System.out.println(object.i + " " + object2.j+ "  " +d);
    }
    
}
