package sindhu.src.Google;

//5th problem
public class Rect {
    int l;
    int b;

    class Rect1{
        int l1;
        int b1;
        
    }

    void a(){
        int a = l*b;
        System.out.println(a);
      }
    
      void p(){
       int  p = 2*(l+b);
        System.out.println(p);
      }
      public static void main(String[] args) {
        Rect v = new Rect(4,5);
        v.a();
        v.p();

        Rect w = new Rect(5,8);
        w.a();
        w.p();
      
      }

      Rect(int length,int breadth)
      {
          l=length;
          b=breadth;
          System.out.println("first");
      
      }
    }



      
   

    
     

     

    
    
    
        
    
    

