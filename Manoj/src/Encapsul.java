public class Encapsul {
    int i ;
    float f;
    private String n="manoj";


       /*  class outerencapsule{ //created inner class for 
          
            void display(){
                System.out.println("outer encapsule:"+encapsobj.getInt());
            }             
         }*/

    public String getName(){ //getter method  here we retrive the vaue 
        return n;
    }
    public void setName(String name){ //setter method here we change the value 
        n=name;
        class EncapsulInner{ //method inner  class created in setter method 
             private int a=5 ;



                /* class EncapsulNestInner{ //method local nest innner is created 
                    String m="man";
                    void nestinnner(){
                        System.out.println("encapsul nested inner class" +"  "+m);
                    }
                 }*/


                 public int getInt(){
                     return a;
                 }
                 public void setInt(int c){
                     c=a;
                 }

                void EncapsulDisplay(int k ){ //created a method  with parameter 
                a=k;
                System.out.println("Encaplsule inner "+" "+a );

            }
        }
        EncapsulInner encapsobj=new EncapsulInner(); //created an instance for the method inner 
        encapsobj.EncapsulDisplay(45);

        
         //in method again i created a class 
        class EncapsulInner2{

            void EncapsulDisplay() {    
              System.out.println("calling the encapsulinner "+" "+encapsobj.getInt());//here i am calling the 
                
            }
      }
       EncapsulInner2 object=new EncapsulInner2();//created instance for method inner class 2
       object.EncapsulDisplay(); 

    }
   
}
class Encapsul2{
    public static void main (String...args){
        Encapsul obj=new Encapsul();
        obj.setName("manoj java");
        System.out.println(obj.getName());
        

    }
}
