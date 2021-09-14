public class Sample4 {

    int i = 30;
    int j = 40;/* instance variables, used in any method, for 
    this we need to creat a object for sample4 class, then only we can access them*/
    static int a = 58;/*no need a obj or instance as the memory alloction is done in stack area,
     static not possilbe in local variables, memory allocation will be done only once*/
     /* suppose if we use this file in other file the static valus should be same in that class 
     also*, if we change the value in any method automatically it refelcts */
     float k = 64885;
     final float f = 63; // final - once assigned the value, we cannot change the value in a prog
     
      public static void main(String[] args)

      {
    int i = 1000;/*local vairables, which are inside the method, can't access to other blcks
    local vair can't be static*/
    
Sample4 Sample4Obj = new Sample4();// creating a obj for  class
//System.out.println("Hi"+" "+"Where");
System.out.println(Sample4Obj.i+" "+i);
System.out.println(Sample4Obj.j);
//System.out.println(a);
//System.out.println(Sample4Obj.a);
System.out.println(Sample4.a);//best to access or call static variable is with class name
Sample4 Sample4Obj1 = new Sample4();
Sample4Obj1.k = 8944;// it doen't effect the k value
System.out.println("Static Value"+" "+Sample4Obj.a);
System.out.println(Sample4Obj.k);
System.out.println(Sample4Obj1.k);
Sample4Obj1.a = 69; //value of a is changed which is static
System.out.println(Sample4Obj.a+" "+Sample4Obj1.a); //change reflected in global varaibale also
System.out.println(Sample4Obj.f);

      }
}