public class Accessmodifier {
    int a ;   //default access
    public int b;  //public access
    private int c; //private access
    //method to access c
     void setc(int i){  //set c's value 
         c=i;
     }
    int getc(){    //get c's value
        return c;
    }    
}
 class Access{
     public static void main (String...args){
         Accessmodifier obj=new Accessmodifier(); //call the Accessmodifier class 
         obj.a=20;
         obj.b=30;
         //obj.c=100; //here c is in private access
         obj.setc(45);//we access the c through method 
         System.out.println("a, b, and c:" + obj.a+" "+obj.b+" "+obj.getc());

     }
 }
